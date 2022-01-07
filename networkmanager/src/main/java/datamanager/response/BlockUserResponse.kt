package datamanager.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BlockUserResponse (

    @SerializedName("status")
    private var status: String? = null,

    @SerializedName("code")
    private var code: Int? = null
):Parcelable