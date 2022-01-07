package com.example.networkmanger.interceptors;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Adds Auth headers to api's
 */
public class ApiInterceptor implements Interceptor {
    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request originalRequest = chain.request();

        Request newRequest = originalRequest.newBuilder()
                .header("Content-Type","application/json;charset=UTF-8")
                .header("Accept","application/json;charset=UTF-8")
                .build();

        return chain.proceed(newRequest);
    }
}
