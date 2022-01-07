package datamanager.request;

public class BaseRequest {

    protected String deviceref;

    protected String app_id;

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
}
