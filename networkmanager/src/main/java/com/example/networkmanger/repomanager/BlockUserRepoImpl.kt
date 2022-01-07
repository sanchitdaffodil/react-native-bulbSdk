package com.example.networkmanger.repomanager

import com.example.networkmanger.Rx.ApiErrorHelper
import com.example.networkmanger.Rx.AppRxSchedulers
import com.example.networkmanger.Rx.RetryAPI
import com.example.networkmanger.network.NetworkManager
import datamanager.request.BlockUserRequest
import datamanager.response.BlockUserResponse
import io.reactivex.Observable

class BlockUserRepoImpl : IBlockUserRepo{

    override fun blockUser(blockUserRequest: BlockUserRequest, token: String): Observable<BlockUserResponse> {
        return NetworkManager.getApiClient().blockUser(token, blockUserRequest)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<BlockUserResponse>().errorParser)
    }
}