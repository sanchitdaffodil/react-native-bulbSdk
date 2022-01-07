package datamanager.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ReportInappropriateContentRequest {

    @SerializedName("args")
    @Expose
    private ReportInappropriateContentArgs args;

    @SerializedName("deviceref")
    @Expose
    private String deviceRef;

    @SerializedName("app_id")
    @Expose
    private String appId;

    public ReportInappropriateContentRequest(ReportInappropriateContentArgs args, String dev_ref, String appId) {
        this.args = args;
        this.deviceRef = dev_ref;
        this.appId = appId;
    }

    public ReportInappropriateContentArgs getArgs() {
        return args;
    }

    public void setArgs(ReportInappropriateContentArgs args) {
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
