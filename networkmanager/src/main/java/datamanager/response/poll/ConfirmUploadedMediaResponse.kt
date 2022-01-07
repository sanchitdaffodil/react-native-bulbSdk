package datamanager.response.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ConfirmUploadedMediaResponse (

    @SerializedName("status")
    val status: String? = null,

    @SerializedName("code")
    val code: Int = 0,

    @SerializedName("data")
    val data: S3UploadData? = null

) : Parcelable

@Parcelize
data class S3UploadData(

    @SerializedName("item")
    val item: Int? = 0,

    @SerializedName("url")
    val url: String? = null

) : Parcelable