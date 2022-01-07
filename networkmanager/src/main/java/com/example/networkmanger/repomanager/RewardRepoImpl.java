package com.example.networkmanger.repomanager;

import com.example.networkmanger.Rx.ApiErrorHelper;
import com.example.networkmanger.Rx.AppRxSchedulers;
import com.example.networkmanger.Rx.RetryAPI;
import com.example.networkmanger.network.NetworkManager;

import datamanager.request.rewards.RewardsRequest;
import datamanager.response.rewards.RewardData;
import datamanager.response.rewards.RewardsResponse;
import io.reactivex.Observable;

public class RewardRepoImpl implements IRewardRepo {


    @Override
    public Observable<RewardsResponse> getRewards(RewardsRequest rewardsRequest, String token) {
        return NetworkManager.getApiClient().getRewards(token,rewardsRequest)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<RewardsResponse>().getErrorParser());
    }

    @Override
    public Observable<RewardData> getRewardsById(RewardsRequest rewardsRequest, String token) {
        return NetworkManager.getApiClient().getRewardsById(token,rewardsRequest)
                .compose(new AppRxSchedulers().applySchedulers()).retryWhen(RetryAPI.retryWithExponentialBackOff())
                .onErrorResumeNext(new ApiErrorHelper<RewardData>().getErrorParser());
    }

}
