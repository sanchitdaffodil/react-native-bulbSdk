package datamanager.request.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnlikeBulbshareRequest {

    @SerializedName("args")
    @Expose
    private UnlikeBulbshareArgs args;

    @SerializedName("deviceref")
    @Expose
    private String deviceRef;

    @SerializedName("app_id")
    @Expose
    private String appId;

    public UnlikeBulbshareRequest(UnlikeBulbshareArgs args, String deviceRef, String appId) {
        this.args = args;
        this.deviceRef = deviceRef;
        this.appId = appId;
    }

    public UnlikeBulbshareArgs getArgs() {
        return args;
    }

    public void setArgs(UnlikeBulbshareArgs args) {
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
