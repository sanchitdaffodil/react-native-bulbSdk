package datamanager.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.Serializable;

public class PollItemDataResult implements Serializable {
    @SerializedName("optionid")
    @Expose
    public Integer optionid;
    @SerializedName("value")
    @Expose
    public String value;
    @SerializedName("video_tn")
    @Expose
    public String video_tn;
    @SerializedName("relX")
    @Expose
    @JsonAdapter(DoubleIgnoreZeroAdapter.class)
    public double relX;
    @SerializedName("relY")
    @Expose
    @JsonAdapter(DoubleIgnoreZeroAdapter.class)
    public double relY;
    @SerializedName("comment")
    @Expose
    public String comment;
    @SerializedName("sentiment")
    @Expose
    public String sentiment;
    @SerializedName("data")
    @Expose
    public Data data;


    public PollItemDataResult(Integer optionid, String value) {
        this.optionid = optionid;
        this.value = value;
    }

    public PollItemDataResult(Integer optionid, String value, String video_tn) {
        this.optionid = optionid;
        this.value = value;
        this.video_tn = video_tn;
    }
    public PollItemDataResult() { }

    public PollItemDataResult(String value) {
        this.value = value;
    }

    public class DoubleIgnoreZeroAdapter extends TypeAdapter<Double> {
        @Override
        public Double read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }

            return in.nextDouble();
        }

        @Override
        public void write(JsonWriter out, Double data) throws IOException {
            if (data == null || data.equals(0.0)) {
                out.nullValue();
                return;
            }

            out.value(data.doubleValue());
        }
    }
    public static class Data implements Serializable {
        @SerializedName("success")
        @Expose
        private Boolean success;

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }
    }
}