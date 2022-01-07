package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class GetLikesData implements Serializable {

    @SerializedName("was_liked_by_me")
    @Expose
    private Boolean was_liked_by_me;
    @SerializedName("list")
    @Expose
    private ArrayList<User> list = null;

    public Boolean getWas_liked_by_me() {
        return was_liked_by_me;
    }

    public void setWas_liked_by_me(Boolean was_liked_by_me) {
        this.was_liked_by_me = was_liked_by_me;
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }
}