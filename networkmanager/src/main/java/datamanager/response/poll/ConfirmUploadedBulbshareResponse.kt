package datamanager.response.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class ConfirmUploadedBulbshareResponse (

    @SerializedName("status")
    val status: String? = null,

    @SerializedName("code")
    val code: Int = 0,

    @SerializedName("data")
    val data: AWSS3UploadData? = null

) : Parcelable

@Parcelize
data class AWSS3UploadData(

    @SerializedName("item")
    val item: String? = null,

    @SerializedName("url")
    val url: String? = null

) : Parcelable