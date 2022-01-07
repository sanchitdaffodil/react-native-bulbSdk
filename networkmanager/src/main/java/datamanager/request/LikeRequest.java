package datamanager.request;

public class LikeRequest {
    public LikeRequestData args;
    public String deviceref;

    public LikeRequestData getArgs() {
        return args;
    }

    public void setArgs(LikeRequestData args) {
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

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String app_id;

}
