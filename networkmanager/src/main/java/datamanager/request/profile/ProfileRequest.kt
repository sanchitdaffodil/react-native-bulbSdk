package datamanager.request.profile

import com.google.gson.annotations.SerializedName

data class ProfileRequest(
    @SerializedName("deviceref")
    val deviceRef: String,
    @SerializedName("app_id")
    val appId: String
)
