package com.bulbsdk;


import android.support.annotation.NonNull;

import com.bulbshare.sdksample.sdk.model.AuthenticateSdkRequest;
import com.bulbshare.sdksample.sdk.sdkClient.BulbshareSdkClient;
import com.bulbshare.sdksample.sdk.utils.BulbshareThemeOptions;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class BulbsdkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Bulbsdk";

    public BulbsdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    public void multiply(int a, int b, Promise promise) {
        BulbshareSdkClient.Companion.getInstance(getCurrentActivity()).authenticate(new AuthenticateSdkRequest(), null);
        promise.resolve(a * b);
    }

    public static native int nativeMultiply(int a, int b);
}
