package com.example.networkmanger.interceptors;

import android.content.Context;

import java.io.IOException;


import com.example.networkmanger.R;
import com.example.networkmanger.exception.NoConnectivityException;
import com.example.networkmanger.utils.ConnectivityUtils;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class ConnectivityInterceptor implements Interceptor {
 
    private Context mContext;
    public ConnectivityInterceptor(Context context) {
        mContext = context;
    }
 
    @Override
    public Response intercept(Chain chain) throws IOException {
        if (!ConnectivityUtils.isNetworkEnabled(mContext)) {
            throw new NoConnectivityException(mContext.getString(R.string.network_error_msg));
        }
 
        Request.Builder builder = chain.request().newBuilder();
        return chain.proceed(builder.build());
    }
 
}