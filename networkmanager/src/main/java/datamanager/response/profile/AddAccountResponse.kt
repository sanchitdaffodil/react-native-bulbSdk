package datamanager.response.profile

import com.google.gson.annotations.SerializedName

data class AddAccountResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("data")
    val data: AddAccountData? = null
)

data class AddAccountData(
    @SerializedName("useraccountid")
    val userAccountId: Int? = null,
)