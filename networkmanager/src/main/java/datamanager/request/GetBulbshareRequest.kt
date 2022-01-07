package datamanager.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GetBulbshareRequest(
    @field:Expose
    @field:SerializedName("args")
    var args: GetBulbshareArgs,

    @field:Expose
    @field:SerializedName("deviceref")
    var deviceRef: String,

    @field:Expose
    @field:SerializedName("app_id")
    var appId: String
)
