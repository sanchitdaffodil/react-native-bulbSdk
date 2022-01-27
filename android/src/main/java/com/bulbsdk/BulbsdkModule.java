package com.bulbsdk;

import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import com.bulbshare.networkmanger.utils.AppPreferences;
import com.bulbshare.sdk.BulbshareSdkClient;
import com.bulbshare.sdk.activity.BriefActivity;
import com.bulbshare.sdk.activity.BulbShareActivity;
import com.bulbshare.sdk.activity.CreateBulbshareActivity;
import com.bulbshare.sdk.activity.ProfileActivity;
import com.bulbshare.sdk.activity.SurveyActivity;
import com.bulbshare.sdk.callbacks.IBulbshareAuthenticateCallback;
import com.bulbshare.sdk.model.AuthenticationSdkResponse;
import com.bulbshare.sdk.model.BulbshareConfiguration;
import com.bulbshare.sdk.model.BulbshareException;
import com.bulbshare.sdk.model.BulbshareUser;
import com.bulbshare.sdk.utils.BundleConstants;
import com.bulbshare.sdk.utils.ThemeData;
import com.facebook.FacebookSdk;
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

        BulbshareUser user = new BulbshareUser();
        user.setEmail(email);
        user.setPassword(password);
        user.setAppVersion("1.2");

        BulbshareSdkClient.getInstance(getReactApplicationContext()).connect(user, new IBulbshareAuthenticateCallback() {
            @Override
            public void onAuthenticationFail(BulbshareException response) {
                promise.resolve("failed");
            }

            @Override
            public void onAuthenticationSuccess(AuthenticationSdkResponse response) {
                AppPreferences.getInstance().putBoolean("loggedIn", true);
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

    @ReactMethod
    public void configSdk(String THEME_Primary_COLOUR, String THEME_SEC_COLOUR ,String PROFILE_TAB_COLOUR ,String GOOGLE_KEY, String FB_KEY, String TWITTER_KEY, String TWITTER_SECRET, String WlaId) {
        ThemeData themeData = new ThemeData(getColor(THEME_Primary_COLOUR), getColor(THEME_SEC_COLOUR));
        if (PROFILE_TAB_COLOUR.length() > 0) {
            themeData.setMyProfileTabIndicatorColor(getColor(PROFILE_TAB_COLOUR));
        }

        BulbshareConfiguration config = new BulbshareConfiguration();
        config.setThemeOptions(66,themeData);

        if (GOOGLE_KEY.length() > 0) {
            config.setGoogleKey(GOOGLE_KEY);
        }
        if (FB_KEY.length() > 0) {
            config.setFbAppId(FB_KEY);
        }
        if (TWITTER_KEY.length() > 0 && TWITTER_SECRET.length() > 0) {
            config.setTwitterKeys(TWITTER_KEY,TWITTER_SECRET);
        }
        if (WlaId.length() > 0) {
            config.setWlaId(WlaId);
        } else {
            config.setWlaId("0");
        }
        BulbshareSdkClient.getInstance(getReactApplicationContext()).initialize(config);
    }

    private static int getColor(String colourName) {
        switch (colourName) {
            case "color_time_left":
                return R.color.color_time_left;
            case "feed_footer_grey":
                return R.color.feed_footer_grey;
            case "active_like_icon":
                return R.color.active_like_icon;
            case "color_blue":
                return R.color.color_blue;
            case "color_header":
                return R.color.color_header;
            case "cerulean_blue":
                return R.color.cerulean_blue;
            case "bulbshare_list_item_header_bg":
                return R.color.bulbshare_list_item_header_bg;
            case "bulbshare_list_item_user_name_text":
                return R.color.bulbshare_list_item_user_name_text;
            case "share_selectnetwork_bg":
                return R.color.share_selectnetwork_bg;
            case "share_bottn_disabled":
                return R.color.share_bottn_disabled;
            case "submit_tools_bg":
                return R.color.submit_tools_bg;
            case "gradient_end_color":
                return R.color.gradient_end_color;
            default:
                return R.color.color_5D6363;
        }
    }

    public static native int nativeMultiply(int a, int b);
}
