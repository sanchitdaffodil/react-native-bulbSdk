package datamanager.request.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import datamanager.response.PollItemResultFinal
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SubmitSurveyRequest(
    @SerializedName("deviceref")
    var deviceRef: String,

    @SerializedName("app_id")
    var appId: String,

    @SerializedName("args")
    var args: SubmitSurveyArgs
    
)  : Parcelable

@Parcelize
data class SubmitSurveyArgs(
    
    @SerializedName("ref")
    var briefRef: String,

    @SerializedName("responses")
    var responses: ArrayList<PollItemResultFinal>? = null,

    @SerializedName("fp")
    var fp: String = "",
    
) : Parcelable