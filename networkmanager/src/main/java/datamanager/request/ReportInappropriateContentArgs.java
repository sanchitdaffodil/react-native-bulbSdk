package datamanager.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReportInappropriateContentArgs {

    @SerializedName("ref")
    @Expose
    private String ref;

    @SerializedName("reason")
    @Expose
    private String reason;

    public ReportInappropriateContentArgs(String bulbshareRef, String s) {
        this.ref = bulbshareRef;
        this.reason = s;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
