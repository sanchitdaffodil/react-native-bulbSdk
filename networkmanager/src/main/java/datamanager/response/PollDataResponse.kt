package datamanager.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import datamanager.response.PollDataResultData
import java.io.Serializable

class PollDataResponse : Serializable {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("code")
    @Expose
    var code: Int? = null

    @SerializedName("data")
    @Expose
    var data: PollDataResultData? = null
}