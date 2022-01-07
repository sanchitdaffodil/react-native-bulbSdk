package datamanager.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteBulbshareArgs {

    @SerializedName("bulbshareref")
    @Expose
    private String bulbshareref;

    public DeleteBulbshareArgs(String bulbshareref) {
        this.bulbshareref = bulbshareref;
    }

    public String getBulbshareref() {
        return bulbshareref;
    }

    public void setBulbshareref(String bulbshareref) {
        this.bulbshareref = bulbshareref;
    }
}
