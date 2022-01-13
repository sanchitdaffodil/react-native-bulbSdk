package com.bulbsdk;

import static com.facebook.FacebookSdk.getApplicationContext;

import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.bulbshare.sdksample.sdk.activity.BriefActivity;
import com.bulbshare.sdksample.sdk.activity.BulbShareActivity;
import com.bulbshare.sdksample.sdk.activity.CreateBulbshareActivity;
import com.bulbshare.sdksample.sdk.activity.ProfileActivity;
import com.bulbshare.sdksample.sdk.activity.SurveyActivity;
import com.bulbshare.sdksample.sdk.callbacks.IBulbshareAuthenticateCallback;
import com.bulbshare.sdksample.sdk.model.AuthenticateSdkRequest;
import com.bulbshare.sdksample.sdk.model.AuthenticationSdkResponse;
import com.bulbshare.sdksample.sdk.model.BulbshareException;
import com.bulbshare.sdksample.sdk.sdkClient.BulbshareSdkClient;
import com.bulbshare.sdksample.sdk.utils.BundleConstants;
import com.bulbshare.sdksample.sdk.utils.ThemeData;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = BulbsdkModule.NAME)
public class BulbsdkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Bulbsdk";
    public static boolean isAuthenticated = false;
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
    public void authenticate(String email, String password, Promise promise) {

        ThemeData themeData = new ThemeData(R.color.color_5D6363, R.color.color_803C3C47);

        BulbshareSdkClient.getInstance(getApplicationContext()).setThemeOptions(66, themeData);

        AuthenticateSdkRequest authenticationRequest = new AuthenticateSdkRequest();
        authenticationRequest.setEmail(email);
        authenticationRequest.setPassword(password);
        authenticationRequest.setAppVersion("1.2");
        BulbshareSdkClient.getInstance(getApplicationContext())
                .authenticate(authenticationRequest, new IBulbshareAuthenticateCallback() {
                    @Override
                    public void onAuthenticationFail(BulbshareException response) {
                        promise.resolve("failed");
                    }

                    @Override
                    public void onAuthenticationSuccess(AuthenticationSdkResponse response) {
                        isAuthenticated = true;
                        promise.resolve("success");
                    }
                });


    }
    @ReactMethod
    public void open() {
        if (isAuthenticated) {
            ReactApplicationContext context = getReactApplicationContext();
            Intent intent = new Intent(context, BulbShareActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            context.startActivity(intent);
        }
    }

    @ReactMethod
    public void callBriefIntro(String briefRef) {
        if (isAuthenticated) {
            ReactApplicationContext context = getReactApplicationContext();
            Intent intent = new Intent(context, BriefActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            intent.putExtra(BundleConstants.BRIEF_REF, briefRef);
            context.startActivity(intent);
        }
    }

    @ReactMethod
    public void callFeedScreen() {
        if (isAuthenticated) {
            ReactApplicationContext context = getReactApplicationContext();
            Intent intent = new Intent(context, BulbShareActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            context.startActivity(intent);
        }
    }

    @ReactMethod
    public void callBriefSurvey(String briefRef) {
        if (isAuthenticated) {
            ReactApplicationContext context = getReactApplicationContext();
            Intent intent = new Intent(context, SurveyActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            intent.putExtra(BundleConstants.BRIEF_REF, briefRef);
            context.startActivity(intent);
        }
    }

    @ReactMethod
    public void callCreateBulbShare(String briefRef) {
        if (isAuthenticated) {
            ReactApplicationContext context = getReactApplicationContext();
            Intent intent = new Intent(context, CreateBulbshareActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            intent.putExtra(BundleConstants.BRIEF_REF, briefRef);
            context.startActivity(intent);
        }
    }

    @ReactMethod
    public void callMyProfile() {
        if (isAuthenticated) {
            ReactApplicationContext context = getReactApplicationContext();
            Intent intent = new Intent(context, ProfileActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            context.startActivity(intent);
        }
    }

    public static native int nativeMultiply(int a, int b);
}
