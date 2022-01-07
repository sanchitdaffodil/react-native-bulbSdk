package com.example.networkmanger.repomanager;

import datamanager.request.BriefsRequest;
import datamanager.request.LikeRequest;
import datamanager.response.FeedsResponse;
import datamanager.response.LikeResponse;
import io.reactivex.Observable;

public interface ILikeRepo {
    Observable<LikeResponse> likeBrief(LikeRequest req, String token);
    Observable<LikeResponse> disLikeBrief(LikeRequest req, String token);

    Observable<LikeResponse> likeBulbshare(LikeRequest req, String token);
    Observable<LikeResponse> dislikeBulbshare(LikeRequest req, String token);
}
