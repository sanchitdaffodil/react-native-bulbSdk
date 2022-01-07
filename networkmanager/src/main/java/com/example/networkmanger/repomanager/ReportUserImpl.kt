package com.example.networkmanger.repomanager

import com.example.networkmanger.Rx.ApiErrorHelper
import com.example.networkmanger.Rx.AppRxSchedulers
import com.example.networkmanger.Rx.RetryAPI
import com.example.networkmanger.network.NetworkManager
import datamanager.request.ReportUserRequest
import datamanager.response.ReportUserResponse
import datamanager.response.profile.ProfileResponse
import io.reactivex.Observable

class ReportUserImpl : IReportUserRepo {
    override fun reportUser(reportUserRequest: ReportUserRequest, token: String): Observable<ReportUserResponse> {
        return NetworkManager.getApiClient().reportUser(token, reportUserRequest)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<ReportUserResponse>().errorParser)
    }
}