package datamanager.request.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BulbshareByBriefArgs {

    @SerializedName("briefref")
    @Expose
    private String briefref;

    @SerializedName("count")
    @Expose
    private int count;

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("sort_type")
    @Expose
    private int sort_type;

    public String getBriefref() {
        return briefref;
    }

    public void setBriefref(String briefref) {
        this.briefref = briefref;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSort_type() {
        return sort_type;
    }

    public void setSort_type(int sort_type) {
        this.sort_type = sort_type;
    }

    public BulbshareByBriefArgs(String briefref, int count, int page, int sort_type) {
        this.briefref = briefref;
        this.count = count;
        this.page = page;
        this.sort_type = sort_type;
    }
}
