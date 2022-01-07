package com.example.networkmanger.repomanager

import com.example.networkmanger.Rx.ApiErrorHelper
import com.example.networkmanger.Rx.AppRxSchedulers
import com.example.networkmanger.Rx.RetryAPI
import com.example.networkmanger.network.NetworkManager
import datamanager.request.profile.*
import datamanager.response.FeedsResponse
import datamanager.response.profile.*
import io.reactivex.Observable

class ProfileRepoImpl : IProfileRepo {

    override fun getMyProfile(req: ProfileRequest, token: String): Observable<ProfileResponse> {
        return NetworkManager.getApiClient().getMyProfile(token, req)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<ProfileResponse>().errorParser)
    }

    override fun getBulbsharesByUser(req: UserBulbsharesRequest, token: String): Observable<UserBulbsharesResponse> {
        return NetworkManager.getApiClient().getBulbsharesByUser(token, req)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<UserBulbsharesResponse>().errorParser)
    }

    override fun getBrandsByUser(req: UserBulbsharesRequest, token: String): Observable<UserBrandsResponse> {
        return NetworkManager.getApiClient().getBrandsByUser(token, req)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<UserBrandsResponse>().errorParser)
    }

    override fun changeAvatar(req: ChangeAvatarRequest, token: String): Observable<ChangeAvatarResponse> {
        return NetworkManager.getApiClient().changeAvatar(token, req)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<ChangeAvatarResponse>().errorParser)
    }

    override fun addAccount(req: AddAccount, token: String): Observable<AddAccountResponse> {
        return NetworkManager.getApiClient().addAccount(token, req)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<AddAccountResponse>().errorParser)
    }

    override fun removeAccount(req: RemoveAccountRequest, token: String): Observable<ChangeAvatarResponse> {
        return NetworkManager.getApiClient().removeAccount(token, req)
            .compose(AppRxSchedulers().applySchedulers())
            .retryWhen(RetryAPI.retryWithExponentialBackOff())
            .onErrorResumeNext(ApiErrorHelper<ChangeAvatarResponse>().errorParser)
    }
}