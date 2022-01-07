package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import datamanager.response.poll.BulbshareBrandThemeResponse;

public class BulbshareBYBriefResponse {
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("data")
    @Expose
    private BulbshareBrandThemeResponse data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BulbshareBrandThemeResponse getData() {
        return data;
    }

    public void setData(BulbshareBrandThemeResponse data) {
        this.data = data;
    }
}
