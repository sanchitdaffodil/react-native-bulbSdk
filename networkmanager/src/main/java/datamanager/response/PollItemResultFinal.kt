package datamanager.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.ArrayList

class PollItemResultFinal: Serializable {
    @SerializedName("pollitemid")
    @Expose
    var pollitemid: Int? = null

    @SerializedName("poll_type")
    @Expose
    var pollType: Int? = null

    @SerializedName("collection")
    @Expose
    var collection: ArrayList<PollItemDataResult>? = ArrayList<PollItemDataResult>()
}