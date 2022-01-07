package datamanager.request.rewards

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class RewardsRequest (

    @SerializedName("args")
    var args: Args? = Args(),

    @SerializedName("deviceref")
    private var deviceref:String,

    @SerializedName("app_id")
    private var appId:String

    ): Parcelable {

}
@Parcelize
data class Args(
    @SerializedName("id" )
    private var id: Int? = null
):Parcelable