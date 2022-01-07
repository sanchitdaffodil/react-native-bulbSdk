package datamanager.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import datamanager.response.poll.AWSS3UploadCredentials
import kotlinx.parcelize.Parcelize

@Parcelize
data class SubmitBulbshareResponse(

    @SerializedName("status")
    val status: String? = null,

    @SerializedName("code")
    val code: Int = 0,

    @SerializedName("data")
    val data: BulbshareRef? = null

) : Parcelable

@Parcelize
data class BulbshareRef(

    @SerializedName("bulbshareref")
    val bulbshareref: String? = null,

) : Parcelable