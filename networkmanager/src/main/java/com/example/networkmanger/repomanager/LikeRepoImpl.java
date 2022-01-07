package com.example.networkmanger.repomanager;

import com.example.networkmanger.Rx.ApiErrorHelper;
import com.example.networkmanger.Rx.AppRxSchedulers;
import com.example.networkmanger.Rx.RetryAPI;
import com.example.networkmanger.network.NetworkManager;

import datamanager.request.BriefsRequest;
import datamanager.request.LikeRequest;
import datamanager.response.FeedsResponse;
import datamanager.response.LikeResponse;
import io.reactivex.Observable;

public class LikeRepoImpl implements ILikeRepo {

    @Override
    public Observable<LikeResponse> likeBrief(LikeRequest requestObj, String token) {
        return NetworkManager.getApiClient().likeBriefs(token,requestObj)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<LikeResponse>().getErrorParser());
    }

    @Override
    public Observable<LikeResponse> disLikeBrief(LikeRequest req, String token) {
        return NetworkManager.getApiClient().dislikeBriefs(token,req)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<LikeResponse>().getErrorParser());
    }

    @Override
    public Observable<LikeResponse> likeBulbshare(LikeRequest req, String token) {
        return  NetworkManager.getApiClient().likeBulbshare(token,req)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<LikeResponse>().getErrorParser());
    }

    @Override
    public Observable<LikeResponse> dislikeBulbshare(LikeRequest req, String token) {
        return NetworkManager.getApiClient().dislikeBulbshare(token,req)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<LikeResponse>().getErrorParser());
    }


}
