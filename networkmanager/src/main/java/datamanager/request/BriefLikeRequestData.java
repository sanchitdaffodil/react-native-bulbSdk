package datamanager.request;

public class BriefLikeRequestData extends BriefRequestData {

    private Boolean with_my_status;
    private int count;
    private String briefref;

    public Boolean getWith_my_status() {
        return with_my_status;
    }

    public void setWith_my_status(Boolean with_my_status) {
        this.with_my_status = with_my_status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBriefref() {
        return briefref;
    }

    public void setBriefref(String briefref) {
        this.briefref = briefref;
    }
}
