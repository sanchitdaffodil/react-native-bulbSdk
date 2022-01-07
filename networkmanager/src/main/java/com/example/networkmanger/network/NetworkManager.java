package com.example.networkmanger.network;

import android.content.Context;
import android.os.Handler;
import android.os.StrictMode;


import com.example.networkmanger.BuildConfig;
import com.example.networkmanger.interceptors.ApiInterceptor;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;


import com.example.networkmanger.apis.Api;
import com.example.networkmanger.interceptors.AuthorizationInterceptor;
import com.example.networkmanger.interceptors.BasicHeaderInterceptor;
import com.example.networkmanger.interceptors.CacheInterceptor;
import com.example.networkmanger.interceptors.ConnectivityInterceptor;
import com.example.networkmanger.interceptors.ResponseInterceptor;
import com.example.networkmanger.interceptors.TimeoutInterceptor;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

import okhttp3.Cache;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager {
    private static OkHttpClient sOkHttpClient;
    private static Api mApi;
    private static Retrofit retrofit;

    private NetworkManager() {
    }

    /**
     * Initial setup for network manager
     *
     * @param ctx    App context, Needed for cache initialization
     */
    public static void init(Context ctx) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
               // .cache(new Cache(ctx.getCacheDir(), NetworkConstants.CACHE_SIZE))
                .addInterceptor(new ApiInterceptor())
                .addInterceptor(new ConnectivityInterceptor(ctx))
                .addInterceptor(new CacheInterceptor())
                .addInterceptor(new TimeoutInterceptor())
                .addInterceptor(new BasicHeaderInterceptor())
                .addInterceptor(new AuthorizationInterceptor())
                .addNetworkInterceptor(new ResponseInterceptor())
                .connectTimeout(NetworkConstants.DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(NetworkConstants.DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(logging);
        }

        sOkHttpClient = builder.build();

    }

    private static Retrofit getRetrofitInstance() {
        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                            .setLenient().create()))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(NetworkManagerClient.getInstance().getBaseUrl())
                    .client(sOkHttpClient)
                    .build();
        return retrofit;
    }

    /**
     * @return {@link Api} Retrofit client
     */
    public static Api getApiClient() {
        if (mApi == null) {
            mApi = getRetrofitInstance().create(Api.class);
        }
        return mApi;
    }

    public static void setCustomSSLVerifier(HttpsURLConnection conn) {
        SSLContext context = getSSLContext();
        conn.setHostnameVerifier(getHostNameVerifier());
        if (context != null) {
            conn.setSSLSocketFactory(context.getSocketFactory());
        }

    }

    public static SSLContext getSSLContext() {
        SSLContext context = null;
        try {
            context = SSLContext.getInstance("TLS");
            context.init(null, getTrustedManager(), new SecureRandom());
        } catch (NoSuchAlgorithmException e) {
            context = null;

        } catch (KeyManagementException e) {
            context = null;
        }
        return context;
    }

    public static X509TrustManager[] getTrustedManager() {
        return new X509TrustManager[] {
                new X509TrustManager() {
                    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    }
                    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    }
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                }
        };
    }

    public static HostnameVerifier getHostNameVerifier() {
        HostnameVerifier vf = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                if(BuildConfig.DEBUG) {
                    return true;
                }
                else {
                    if (hostname.endsWith("bulbshare.com")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        };
        return vf;
    }
}