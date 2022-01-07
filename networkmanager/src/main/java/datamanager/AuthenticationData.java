package datamanager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthenticationData {

    @SerializedName("userref")
    @Expose
    private String userref;
    @SerializedName("deviceref")
    @Expose
    private String deviceref;
    @SerializedName("auth_secret")
    @Expose
    private String authSecret;

    public String getUserref() {
        return userref;
    }

    public void setUserref(String userref) {
        this.userref = userref;
    }

    public String getDeviceref() {
        return deviceref;
    }

    public void setDeviceref(String deviceref) {
        this.deviceref = deviceref;
    }

    public String getAuthSecret() {
        return authSecret;
    }

    public void setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
    }

}