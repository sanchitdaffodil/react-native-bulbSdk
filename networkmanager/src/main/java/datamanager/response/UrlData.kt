package datamanager.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class UrlData : Serializable {
    @SerializedName("url")
    @Expose
    var url: String? = null
}