package com.example.networkmanger.repomanager

import datamanager.request.GetSharableUrlRequest
import datamanager.response.BulbshareResponse
import datamanager.response.GetSharableUrlResponse
import io.reactivex.Observable

interface ISharableUrlRepo {

    fun getSharableUrl(request: GetSharableUrlRequest?, token: String?): Observable<GetSharableUrlResponse?>?

}