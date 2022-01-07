package datamanager.request.profile

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class AddAccount(
    @SerializedName("deviceref")
    val deviceRef: String = "",
    @SerializedName("app_id")
    val appId: String = "",
    @SerializedName("args")
    val args: AddAccountModel? = null,
)

data class AddAccountModel(
    @SerializedName("type")
    val type: Int? = null,
    @SerializedName("account_id")
    val accountId: String? = null,
    @SerializedName("account_name")
    val accountName: String? = null,
    @SerializedName("authentication")
    val authentication: JSONObject? = null,
    @SerializedName("data")
    val data: JSONObject? = null,
)