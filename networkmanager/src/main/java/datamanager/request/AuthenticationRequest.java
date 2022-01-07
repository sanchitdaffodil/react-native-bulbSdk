package datamanager.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import datamanager.AuthenticationRequestData;

public class AuthenticationRequest {

    @SerializedName("args")
    @Expose
    private AuthenticationRequestData args;
    @SerializedName("app_id")
    @Expose
    private String appId;

    public AuthenticationRequestData getArgs() {
        return args;
    }

    public void setArgs(AuthenticationRequestData args) {
        this.args = args;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}