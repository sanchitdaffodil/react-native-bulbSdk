package datamanager.request.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LikeBulbshareArgs {

    @SerializedName("bulbshareref")
    @Expose
    private String bulbshareref;

    public LikeBulbshareArgs(String bulbshareRef) {
        this.bulbshareref = bulbshareRef;
    }

    public String getBulbshareref() {
        return bulbshareref;
    }

    public void setBulbshareref(String bulbshareref) {
        this.bulbshareref = bulbshareref;
    }
}
