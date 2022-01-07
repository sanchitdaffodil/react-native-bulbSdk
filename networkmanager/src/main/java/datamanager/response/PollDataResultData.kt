package datamanager.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PollDataResultData : Serializable {
    @SerializedName("success")
    @Expose
    var success: Boolean? = null
}