package com.bulbsdk;

import static com.facebook.FacebookSdk.getApplicationContext;

import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.bulbshare.sdksample.sdk.activity.BulbShareActivity;
import com.bulbshare.sdksample.sdk.callbacks.IBulbshareAuthenticateCallback;
import com.bulbshare.sdksample.sdk.model.AuthenticateSdkRequest;
import com.bulbshare.sdksample.sdk.model.AuthenticationSdkResponse;
import com.bulbshare.sdksample.sdk.model.BulbshareException;
import com.bulbshare.sdksample.sdk.sdkClient.BulbshareSdkClient;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = BulbsdkModule.NAME)
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
        promise.resolve(a * b);
    }

    @ReactMethod
    public void authenticate(String username, String password, Promise promise) {
        AuthenticateSdkRequest authenticationRequest = new AuthenticateSdkRequest();
        authenticationRequest.setEmail("abhijeet.verma@unthinkable.co");
        authenticationRequest.setPassword("sdktest901$");
        authenticationRequest.setAppVersion("1.2");
        BulbshareSdkClient.getInstance(getApplicationContext())
                .authenticate(authenticationRequest, new IBulbshareAuthenticateCallback() {
                    @Override
                    public void onAuthenticationFail(BulbshareException response) {
                        promise.resolve("failed");

                        //Toast.makeText(getApplicationContext(), "Auth Fail " + response.getmessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAuthenticationSuccess(AuthenticationSdkResponse response) {
                        //Toast.makeText(getApplicationContext(), "Auth Success", Toast.LENGTH_SHORT).show();
                        promise.resolve("success");
                    }
                });


    }
    @ReactMethod
    public void open() {
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, BulbShareActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        context.startActivity(intent);
        //startActivity(new Intent(this, BulbShareActivity.class));
    }

    public static native int nativeMultiply(int a, int b);
}
