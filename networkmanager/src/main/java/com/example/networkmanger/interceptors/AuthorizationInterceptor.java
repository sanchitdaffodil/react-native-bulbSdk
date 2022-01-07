package com.example.networkmanger.interceptors;


import android.util.Base64;
import android.util.Log;

import com.example.networkmanger.utils.AppPreferenceKey;
import com.example.networkmanger.utils.AppPreferences;
import com.example.networkmanger.utils.Authutils;
import com.google.android.gms.common.util.Hex;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/**
 * User creds interceptor
 * <p>
 * Adds the user name, pass, apkVersion etc to API's having userCreds value set to true
 */
public class AuthorizationInterceptor implements Interceptor {

    private String bodyToString(final RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null)
                copy.writeTo(buffer);
            else
                return null;
            return buffer.readUtf8();
        } catch (final IOException e) {
            return null;
        }
    }

    public static String getDataSignatureHash(String data, String secret) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec signingKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(signingKey);

        byte[] digest = mac.doFinal(data.getBytes("UTF-8"));

        String alt1 = format_hmac_alt1(digest);

        return alt1;
    }

    public static String format_hmac_alt1(byte[] hash) {
        String hex = Hex.bytesToStringLowercase(hash);

        return hex;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request newRequest = null;
        String authentication_header_b64 = "";
        String authSecret = originalRequest.headers().get("Authorization");

        if (authSecret != null) {
            String userRef = AppPreferences.getInstance().getString(AppPreferenceKey.USER_REF);
            String request_id = Authutils.getMd5Hash(System.currentTimeMillis() + userRef);
            String data = chain.request().url().encodedPath() + ":" + bodyToString(originalRequest.body()) + ":" + request_id;
            Log.v("shubham", "data = " + data);
            String signature_hash = null;
            try {
                signature_hash = getDataSignatureHash(data, authSecret);
            } catch (NoSuchAlgorithmException e) {

            } catch (InvalidKeyException e) {

            }
            String authentication_header = userRef + ":" + signature_hash + ":" + request_id;
            authentication_header_b64 = Base64.encodeToString(authentication_header.getBytes("UTF-8"), Base64.DEFAULT | Base64.NO_WRAP);

            if (authentication_header_b64 != null) {
                newRequest = originalRequest.newBuilder()
                        .header("Authorization", "Basic " + authentication_header_b64)
                        .build();
                return chain.proceed(newRequest);
            }
        }

        return chain.proceed(originalRequest);
    }



}
