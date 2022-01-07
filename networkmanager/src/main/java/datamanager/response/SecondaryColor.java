package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SecondaryColor implements Serializable {
    @SerializedName("R")
    @Expose
    private Integer r;
    @SerializedName("G")
    @Expose
    private Integer g;
    @SerializedName("B")
    @Expose
    private Integer b;
    @SerializedName("A")
    @Expose
    private Integer a;
    public Integer getR() {
        return r;
    }
    public void setR(Integer r) {
        this.r = r;
    }
    public Integer getG() {
        return g;
    }
    public void setG(Integer g) {
        this.g = g;
    }
    public Integer getB() {
        return b;
    }
    public void setB(Integer b) {
        this.b = b;
    }
    public Integer getA() {
        return a;
    }
    public void setA(Integer a) {
        this.a = a;
    }
}