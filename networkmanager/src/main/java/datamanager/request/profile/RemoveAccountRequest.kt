package datamanager.request.profile

import com.google.gson.annotations.SerializedName

data class RemoveAccountRequest(
    @SerializedName("deviceref")
    val deviceRef: String = "",
    @SerializedName("app_id")
    val appId: String = "",
    @SerializedName("args")
    val args: Map<String, Any>? = null
)
