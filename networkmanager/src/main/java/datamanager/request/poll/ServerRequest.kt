package datamanager.request.poll

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.HashMap

data class ServerRequest(@field:SerializedName("deviceref") var deviceref: String, @field:SerializedName(
        "app_id") var app_id: String) : Serializable {
    @SerializedName("args")
    var args: Map<String, Any> = HashMap()
}