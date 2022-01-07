package com.example.networkmanger.repomanager

import datamanager.request.ReportUserRequest
import datamanager.request.rewards.RewardsRequest
import datamanager.response.ReportUserResponse
import datamanager.response.rewards.RewardsResponse
import io.reactivex.Observable

interface IReportUserRepo {

    fun reportUser(reportUserRequest: ReportUserRequest,token:String):Observable<ReportUserResponse>

}