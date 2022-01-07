package com.example.networkmanger.interceptors;

import java.io.IOException;
import java.util.Locale;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Interceptor to cache data and maintain it specified time.
 * <p>
 * If the same network request is sent within specified time,
 * the response is retrieved from cache.
 */
public class ResponseInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        Response originalResponse = chain.proceed(chain.request());

        // add cache expire time if header has ApplyResponseCache value to true
        if (Boolean.valueOf(request.header("ApplyResponseCache"))) {
            return originalResponse.newBuilder()
                    .removeHeader("ApplyResponseCache")
                    .header("Cache-Control", String.format(Locale.getDefault(),"max-age=%d, only-if-cached, max-stale=%d", 1200, 0))
                    .build();
        }

        return originalResponse;
    }
}