package datamanager.request;

public class BriefsRequest {
    private BriefRequestData args;
    private String deviceref;
    private String app_id;

    public BriefRequestData getArgs() {
        return args;
    }
    public void setArgs(BriefRequestData args) {
        this.args = args;
    }
    public String getDeviceref() {
        return deviceref;
    }
    public void setDeviceref(String deviceref) {
        this.deviceref = deviceref;
    }
    public String getApp_id() {
        return app_id;
    }
    public void setApp_id(String appId) {
        this.app_id = appId;
    }


}



