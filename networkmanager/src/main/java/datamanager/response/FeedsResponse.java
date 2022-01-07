package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import datamanager.AuthenticationData;

public class FeedsResponse {
    @SerializedName("status")
    @Expose
    private String status;

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

    public BriefsResponse getData() {
        return data;
    }

    public void setData(BriefsResponse data) {
        this.data = data;
    }

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("data")
    @Expose
    private BriefsResponse data;

    @Override
    public String toString() {
        return "FeedsResponse{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
