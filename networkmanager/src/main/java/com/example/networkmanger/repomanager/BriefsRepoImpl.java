package com.example.networkmanger.repomanager;

import com.example.networkmanger.Rx.ApiErrorHelper;
import com.example.networkmanger.Rx.AppRxSchedulers;
import com.example.networkmanger.Rx.RetryAPI;
import com.example.networkmanger.network.NetworkManager;

import datamanager.request.BriefsRequest;
import datamanager.request.BulbshareCommentRequest;
import datamanager.request.BulbshareGetLikesRequest;
import datamanager.request.BulbsharesByBriefRequest;
import datamanager.request.LikeRequest;
import datamanager.request.brief.BriefRequest;
import datamanager.response.AddCommentResponse;
import datamanager.response.BulbsharesByBriefResponse;
import datamanager.response.CommentsResponse;
import datamanager.response.FeedsResponse;
import datamanager.response.GetBriefLikesResponse;
import datamanager.response.LikeResponse;
import datamanager.response.brief.BriefResponse;
import io.reactivex.Observable;

public class BriefsRepoImpl implements IBriefsRepo {

    @Override
    public Observable<FeedsResponse> getBriefs(BriefsRequest requestObj, String token) {
        return NetworkManager.getApiClient().getBriefs(token,requestObj)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<FeedsResponse>().getErrorParser());
    }

    @Override
    public Observable<CommentsResponse> getBriefsComment(LikeRequest req, String token) {
        return NetworkManager.getApiClient().getBriefsComments(token,req)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<CommentsResponse>().getErrorParser());
    }

    @Override
    public Observable<BriefResponse> getSingleBrief(BriefRequest requestObj, String token) {
        return NetworkManager.getApiClient().getBrief(token, requestObj)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<BriefResponse>().getErrorParser());
    }

    @Override
    public Observable<BulbsharesByBriefResponse> getBulbsharesByBrief(BulbsharesByBriefRequest request, String token) {
        return NetworkManager.getApiClient().getBulbsharesByBrief(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<BulbsharesByBriefResponse>().getErrorParser());
    }

    @Override
    public Observable<CommentsResponse> getBulbshareComment(BulbshareCommentRequest bulbshareCommentRequest, String token) {
        return NetworkManager.getApiClient().getBsComments(token, bulbshareCommentRequest)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<CommentsResponse>().getErrorParser());
    }

    @Override
    public Observable<GetBriefLikesResponse> getLikesOnBulbshares(BulbshareGetLikesRequest request, String token) {
        return NetworkManager.getApiClient().getBulbshareLikes(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<GetBriefLikesResponse>().getErrorParser());
    }

    @Override
    public Observable<AddCommentResponse> postCommentOnBrief(LikeRequest likeRequest, String token) {
        return NetworkManager.getApiClient().submitCommentOnBrief(token, likeRequest)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<AddCommentResponse>().getErrorParser());
    }

    @Override
    public Observable<LikeResponse> removeCommentOnBrief(LikeRequest request, String token) {
        return NetworkManager.getApiClient().removeCommentOnBrief(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<LikeResponse>().getErrorParser());
    }

    @Override
    public Observable<GetBriefLikesResponse> getLikesOnBrief(BriefsRequest briefRequest, String token) {
        return NetworkManager.getApiClient().getBriefLikes(token, briefRequest)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<GetBriefLikesResponse>().getErrorParser());
    }
}
