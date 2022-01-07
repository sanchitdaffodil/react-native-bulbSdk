package datamanager.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BulbshareResponse {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("code")
    @Expose
    var code: Int? = null

    @SerializedName("data")
    @Expose
    var data: Bulbshare? = null
}
