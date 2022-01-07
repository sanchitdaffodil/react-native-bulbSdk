package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PollLogic implements Serializable {
    @SerializedName("itemlogic_id")
    @Expose
    public Integer itemlogic_id;
    @SerializedName("left_value")
    @Expose
    public String left_value;
    @SerializedName("right_value")
    @Expose
    public String right_value;
    @SerializedName("condition")
    @Expose
    public String condition;
    @SerializedName("skip_to_type")
    @Expose
    public String skip_to_type;
    @SerializedName("skip_to_id")
    @Expose
    public String skip_to_id;

}