package datamanager.request.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BulbshareByBriefRequest {

    @SerializedName("args")
    @Expose
    private BulbshareByBriefArgs args;

    @SerializedName("deviceref")
    @Expose
    private String deviceRef;

    @SerializedName("app_id")
    @Expose
    private String appId;

    public BulbshareByBriefRequest(BulbshareByBriefArgs args, String deviceRef, String appId) {
        this.args = args;
        this.deviceRef = deviceRef;
        this.appId = appId;
    }

    public BulbshareByBriefArgs getArgs() {
        return args;
    }

    public void setArgs(BulbshareByBriefArgs args) {
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


