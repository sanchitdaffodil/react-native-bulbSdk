package datamanager.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteBulbshareRequest {
    @SerializedName("args")
    @Expose
    private DeleteBulbshareArgs args;

    @SerializedName("deviceref")
    @Expose
    private String deviceRef;

    @SerializedName("app_id")
    @Expose
    private String appId;

    public DeleteBulbshareRequest(DeleteBulbshareArgs args, String deviceRef, String appId) {
        this.args = args;
        this.deviceRef = deviceRef;
        this.appId = appId;
    }

    public DeleteBulbshareArgs getArgs() {
        return args;
    }

    public void setArgs(DeleteBulbshareArgs args) {
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
