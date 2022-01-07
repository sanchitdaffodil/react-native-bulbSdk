package com.example.networkmanger.repomanager

import com.example.networkmanger.Rx.ApiErrorHelper
import com.example.networkmanger.Rx.AppRxSchedulers
import com.example.networkmanger.Rx.RetryAPI
import com.example.networkmanger.network.NetworkManager
import datamanager.request.GetSharableUrlRequest
import datamanager.response.BulbshareResponse
import datamanager.response.GetSharableUrlResponse
import io.reactivex.Observable

class SharableUrlRepoImpl : ISharableUrlRepo {

    override fun getSharableUrl(request: GetSharableUrlRequest?, token: String?): Observable<GetSharableUrlResponse?>? {
        return NetworkManager.getApiClient().getBulbshareSharableURL(token, request)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<GetSharableUrlResponse>().getErrorParser())
    }
}