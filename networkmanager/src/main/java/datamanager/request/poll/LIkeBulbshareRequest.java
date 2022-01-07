package datamanager.request.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LIkeBulbshareRequest {

    @SerializedName("args")
    @Expose
    private LikeBulbshareArgs args;

    @SerializedName("deviceref")
    @Expose
    private String deviceRef;

    @SerializedName("app_id")
    @Expose
    private String appId;

    public LIkeBulbshareRequest(LikeBulbshareArgs args, String deviceRef, String appId) {
        this.args = args;
        this.deviceRef = deviceRef;
        this.appId = appId;
    }

    public LikeBulbshareArgs getArgs() {
        return args;
    }

    public void setArgs(LikeBulbshareArgs args) {
        this.args = args;
    }

    public String getDeviceRef() {
        return deviceRef;
    }

    public void setDeviceRef(String deviceRef) {
        this.deviceRef = deviceRef;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
