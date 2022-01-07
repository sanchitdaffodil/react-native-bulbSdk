package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import datamanager.response.poll.CollectionData;
import datamanager.response.poll.PollData;

public class PollItemResult implements Serializable {
    @SerializedName("pollitemid")
    @Expose
    public Integer pollitemid;
    @SerializedName("collection")
    @Expose
    public ArrayList<PollItemDataResult> collection = new ArrayList<>();
    @SerializedName("collectionItems")
    @Expose
    public ArrayList<CollectionData> collectionItems = new ArrayList<>();
    @SerializedName("pollItem")
    @Expose
    public PollData pollItem;
    @SerializedName("logic")
    @Expose
    public ArrayList<PollLogic> logic = new ArrayList<>();

    public static class PollItemOption implements Serializable {
        @SerializedName("optionid")
        @Expose
        public Integer optionid;
        @SerializedName("image")
        @Expose
        public String image;
        @SerializedName("value")
        @Expose
        public String value;
        @SerializedName("text")
        @Expose
        public String text;
        @SerializedName("overlay_text")
        @Expose
        public String overlay_tePollItemOptionxt;
        @SerializedName("items")
        public List<PollItemData> items = new ArrayList<>();
        @SerializedName("link")
        @Expose
        public String link;
        @SerializedName("link_text")
        @Expose
        public String link_text;

    }

}