package com.example.networkmanger.repomanager;

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

public interface IBriefsRepo {
    Observable<FeedsResponse> getBriefs(BriefsRequest req, String token);

    Observable<CommentsResponse> getBriefsComment(LikeRequest req, String token);

    Observable<BriefResponse> getSingleBrief(BriefRequest briefRequest, String token);

    Observable<AddCommentResponse> postCommentOnBrief(LikeRequest briefRequest, String token);

    Observable<LikeResponse> removeCommentOnBrief(LikeRequest briefRequest, String token);

    Observable<GetBriefLikesResponse> getLikesOnBrief(BriefsRequest briefRequest, String token);

    Observable<BulbsharesByBriefResponse> getBulbsharesByBrief(BulbsharesByBriefRequest request, String token);

    Observable<CommentsResponse> getBulbshareComment(BulbshareCommentRequest bulbshareCommentRequest, String token);

    Observable<GetBriefLikesResponse> getLikesOnBulbshares(BulbshareGetLikesRequest request, String token);
}
