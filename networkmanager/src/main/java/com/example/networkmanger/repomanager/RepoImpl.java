package com.example.networkmanger.repomanager;

import android.util.Log;

import com.example.networkmanger.Rx.ApiErrorHelper;
import com.example.networkmanger.Rx.AppRxSchedulers;
import com.example.networkmanger.Rx.RetryAPI;
import com.example.networkmanger.network.NetworkManager;

import datamanager.request.BulbsharesByBriefRequest;
import datamanager.request.DeleteBulbshareRequest;
import datamanager.request.GetBulbshareFeedRequest;
import datamanager.request.GetBulbshareRequest;
import datamanager.request.ReportInappropriateContentRequest;
import datamanager.request.SubmitBulbshareRequest;
import datamanager.request.poll.BulbshareByBriefRequest;
import datamanager.request.poll.BulbshareUploadUrlRequest;
import datamanager.request.poll.COnfirmUploadedBulbshareRequest;
import datamanager.request.poll.ConfirmUploadedMediaRequest;
import datamanager.request.poll.LIkeBulbshareRequest;
import datamanager.request.poll.MediaUploadUrlRequest;
import datamanager.request.poll.PollRequest;
import datamanager.request.poll.SubmitSurveyRequest;
import datamanager.request.poll.UnlikeBulbshareRequest;
import datamanager.response.BulbshareBYBriefResponse;
import datamanager.response.BulbshareResponse;
import datamanager.response.DeleteBulbshareResponse;
import datamanager.response.GetBulbshareFeedResponse;
import datamanager.response.PollDataResponse;
import datamanager.response.ReportInappropriateContentResponse;
import datamanager.response.SubmitBulbshareResponse;
import datamanager.response.UnlikeBulbshareResponse;
import datamanager.response.poll.BulbshareUploadUrlResponse;
import datamanager.response.poll.ConfirmUploadedBulbshareResponse;
import datamanager.request.poll.ServerRequest;
import datamanager.response.PollItemDataResult;
import datamanager.response.poll.ConfirmUploadedMediaResponse;
import datamanager.response.poll.LikeBulbshareResponse;
import datamanager.response.poll.MediaUploadUrlResponse;
import datamanager.response.poll.PollResponse;
import io.reactivex.Observable;

public class RepoImpl implements IPollRepo {
    @Override
    public Observable<PollResponse> getPoll(PollRequest req, String token) {
        return NetworkManager.getApiClient().getPoll(token, req)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<PollResponse>().getErrorParser());
    }

    @Override
    public Observable<MediaUploadUrlResponse> getS3Credentials(MediaUploadUrlRequest request, String token) {
        return NetworkManager.getApiClient().getS3Credentials(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<MediaUploadUrlResponse>().getErrorParser());
    }

    @Override
    public Observable<ConfirmUploadedMediaResponse> getS3UploadData(ConfirmUploadedMediaRequest request, String token) {
        return NetworkManager.getApiClient().getS3UploadedDataResponse(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<ConfirmUploadedMediaResponse>().getErrorParser());
    }

    @Override
    public Observable<BulbshareUploadUrlResponse> getAWSS3Credentials(BulbshareUploadUrlRequest request, String token) {
        return NetworkManager.getApiClient().getAWSS3Credentials(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<BulbshareUploadUrlResponse>().getErrorParser());
    }

    @Override
    public Observable<ConfirmUploadedBulbshareResponse> getAWSS3UploadData(COnfirmUploadedBulbshareRequest request, String token) {
        return NetworkManager.getApiClient().getAWSS3UploadedDataResponse(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<ConfirmUploadedBulbshareResponse>().getErrorParser());
    }

    @Override
    public Observable<SubmitBulbshareResponse> submitBulbshare(SubmitBulbshareRequest request, String token) {
        return NetworkManager.getApiClient().submitBulbshare(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<SubmitBulbshareResponse>().getErrorParser());
    }

    @Override
    public Observable<PollDataResponse> submitPoll(SubmitSurveyRequest req, String token) {
        return NetworkManager.getApiClient().submitPollSurvey(token, req)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<PollDataResponse>().getErrorParser());
    }

    @Override
    public Observable<BulbshareBYBriefResponse> getBulbshareByBrief(BulbshareByBriefRequest request, String token) {
        return NetworkManager.getApiClient().getBulbshareByBrief(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<BulbshareBYBriefResponse>().getErrorParser());
    }

    @Override
    public Observable<UnlikeBulbshareResponse> unlikeBulbshare(UnlikeBulbshareRequest request, String token) {
        return NetworkManager.getApiClient().unlikeBulbshare(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<UnlikeBulbshareResponse>().getErrorParser());
    }

    @Override
    public Observable<LikeBulbshareResponse> likeBulbshare(LIkeBulbshareRequest request, String token) {
        return NetworkManager.getApiClient().likeBulbshare(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<LikeBulbshareResponse>().getErrorParser());
    }

    @Override
    public Observable<ReportInappropriateContentResponse> reportBulbshare(ReportInappropriateContentRequest request, String token) {
        return NetworkManager.getApiClient().reportBulbshare(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<ReportInappropriateContentResponse>().getErrorParser());
    }

    @Override
    public Observable<DeleteBulbshareResponse> deleteBulbshare(DeleteBulbshareRequest request, String token) {
        return NetworkManager.getApiClient().deleteBulbshare(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<DeleteBulbshareResponse>().getErrorParser());
    }

    @Override
    public Observable<BulbshareResponse> getBulbshare(GetBulbshareRequest request, String token) {
        return NetworkManager.getApiClient().getBulbshare(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<BulbshareResponse>().getErrorParser());
    }

    @Override
    public Observable<GetBulbshareFeedResponse> getBulbshareFeed(GetBulbshareFeedRequest request, String token) {
        return NetworkManager.getApiClient().getBulbshareFeed(token, request)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<GetBulbshareFeedResponse>().getErrorParser());
    }
}
