package com.example.networkmanger.interceptors;


import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * User creds interceptor
 * <p>
 * Adds the user name, pass, apkVersion etc to API's having userCreds value set to true
 */
public class BasicHeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        HttpUrl httpUrl = request.url().newBuilder().encodedPath(request.url().encodedPath())
                .build();

        request = request.newBuilder()
                .url(httpUrl)
                .build();

        return chain.proceed(request);
    }
}
