package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddCommentData {

    @SerializedName("bcommentref")
    @Expose
    private String bcommentref;

    public String getBcommentref() {
        return bcommentref;
    }

    public void setBcommentref(String bcommentref) {
        this.bcommentref = bcommentref;
    }
}