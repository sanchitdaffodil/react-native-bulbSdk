package com.example.networkmanger.repomanager;

import datamanager.request.rewards.RewardsRequest;
import datamanager.response.rewards.RewardData;
import datamanager.response.rewards.RewardsResponse;
import io.reactivex.Observable;


public interface IRewardRepo {

    Observable<RewardsResponse> getRewards(RewardsRequest rewardsRequest, String token);

    Observable<RewardData> getRewardsById(RewardsRequest rewardsRequest, String token);
}
