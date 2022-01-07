package com.example.networkmanger.apis;

import org.json.JSONObject;

import datamanager.request.AuthenticationRequest;
import datamanager.request.BlockUserRequest;
import datamanager.request.BriefsRequest;
import datamanager.request.BulbshareCommentRequest;
import datamanager.request.BulbshareGetLikesRequest;
import datamanager.request.BulbsharesByBriefRequest;
import datamanager.request.DeleteBulbshareRequest;
import datamanager.request.GetBulbshareFeedRequest;
import datamanager.request.GetBulbshareRequest;
import datamanager.request.GetSharableUrlRequest;
import datamanager.request.LikeRequest;
import datamanager.request.ReportUserRequest;
import datamanager.request.poll.BulbshareByBriefRequest;
import datamanager.request.profile.AddAccount;
import datamanager.request.poll.SubmitSurveyRequest;
import datamanager.request.profile.ChangeAvatarRequest;
import datamanager.request.profile.ProfileRequest;
import datamanager.request.ReportInappropriateContentRequest;
import datamanager.request.SubmitBulbshareRequest;
import datamanager.request.brief.BriefRequest;
import datamanager.request.poll.BulbshareUploadUrlRequest;
import datamanager.request.poll.COnfirmUploadedBulbshareRequest;
import datamanager.request.poll.ConfirmUploadedMediaRequest;
import datamanager.request.poll.LIkeBulbshareRequest;
import datamanager.request.poll.MediaUploadUrlRequest;
import datamanager.request.poll.PollRequest;
import datamanager.request.profile.RemoveAccountRequest;
import datamanager.request.profile.UserBulbsharesRequest;
import datamanager.request.poll.ServerRequest;
import datamanager.request.poll.UnlikeBulbshareRequest;
import datamanager.request.rewards.RewardsRequest;
import datamanager.response.AddCommentResponse;
import datamanager.response.AuthenticationResponse;
import datamanager.response.BlockUserResponse;
import datamanager.response.BulbshareBYBriefResponse;
import datamanager.response.BulbshareResponse;
import datamanager.response.BulbsharesByBriefResponse;
import datamanager.response.CommentsResponse;
import datamanager.response.DeleteBulbshareResponse;
import datamanager.response.FeedsResponse;
import datamanager.response.GetBriefLikesResponse;
import datamanager.response.GetSharableUrlResponse;
import datamanager.response.GetBulbshareFeedResponse;
import datamanager.response.LikeResponse;
import datamanager.response.PollDataResponse;
import datamanager.response.PollItemDataResult;
import datamanager.response.ReportInappropriateContentResponse;
import datamanager.response.ReportUserResponse;
import datamanager.response.SubmitBulbshareResponse;
import datamanager.response.UnlikeBulbshareResponse;
import datamanager.response.brief.BriefResponse;
import datamanager.response.poll.BulbshareUploadUrlResponse;
import datamanager.response.poll.ConfirmUploadedBulbshareResponse;
import datamanager.response.poll.ConfirmUploadedMediaResponse;
import datamanager.response.poll.LikeBulbshareResponse;
import datamanager.response.poll.MediaUploadUrlResponse;
import datamanager.response.poll.PollResponse;
import datamanager.response.profile.AddAccountResponse;
import datamanager.response.rewards.RewardData;
import datamanager.response.rewards.RewardsResponse;
import datamanager.response.profile.ChangeAvatarResponse;
import datamanager.response.profile.ProfileResponse;
import datamanager.response.profile.UserBrandsResponse;
import datamanager.response.profile.UserBulbsharesResponse;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * All API's should go here
 */
public interface Api {

    @POST("api/myfeedcp")
    Observable<FeedsResponse> getBriefs(@Header("Authorization") String token, @Body BriefsRequest request);

    @POST("api/getbfcomments")
    Observable<CommentsResponse> getBriefsComments(@Header("Authorization") String token,
                                                   @Body LikeRequest request);

    @POST("api/login")
    Observable<AuthenticationResponse> authenticate(@Body AuthenticationRequest request);

    @PUT("api/likebrief")
    Observable<LikeResponse> likeBriefs(@Header("Authorization") String authToken,
                                        @Body LikeRequest likeRequest);

    @PUT("api/unlikebrief")
    Observable<LikeResponse> dislikeBriefs(@Header("Authorization") String authToken,
                                           @Body LikeRequest likeRequest);

    @PUT("api/likebulbshare")
    Observable<LikeResponse> likeBulbshare(@Header("Authorization") String authToken,
                                        @Body LikeRequest likeRequest);

    @PUT("api/unlikebulbshare")
    Observable<LikeResponse> dislikeBulbshare(@Header("Authorization") String authToken,
                                           @Body LikeRequest likeRequest);

    @POST("api/getbrief")
    Observable<BriefResponse> getBrief(@Header("Authorization") String token,
                                       @Body BriefRequest briefRequest);

    @PUT("api/submitbfcomment")
    Observable<AddCommentResponse> submitCommentOnBrief(@Header("Authorization") String authToken,
                                                        @Body LikeRequest likeRequest);

    @PUT("api/removebfcomment")
    Observable<LikeResponse> removeCommentOnBrief(@Header("Authorization") String authToken,
                                                  @Body LikeRequest likeRequest);

    @POST("api/getbrieflikes")
    Observable<GetBriefLikesResponse> getBriefLikes(@Header("Authorization") String token,
                                                    @Body BriefsRequest request);

    @POST("api/getbriefpoll")
    Observable<PollResponse> getPoll(@Header("Authorization") String token, @Body PollRequest request);

    @POST("api/requestmediaquestionuploadurl")
    Observable<MediaUploadUrlResponse> getS3Credentials(@Header("Authorization") String token,
                                                        @Body MediaUploadUrlRequest request);

    @POST("api/confirmmediaquestionupload")
    Observable<ConfirmUploadedMediaResponse> getS3UploadedDataResponse(@Header("Authorization") String token,
                                                                       @Body ConfirmUploadedMediaRequest request);

    @POST("api/profile")
    Observable<ProfileResponse> getMyProfile(@Header("Authorization") String token,
                                             @Body ProfileRequest request);

    @POST("api/getbulbsharesbyuser")
    Observable<UserBulbsharesResponse> getBulbsharesByUser(@Header("Authorization") String token,
                                                            @Body UserBulbsharesRequest request);

    @POST("api/getfollowedbrands")
    Observable<UserBrandsResponse> getBrandsByUser(@Header("Authorization") String token,
                                                   @Body UserBulbsharesRequest request);

    @POST("api/changeavatar")
    Observable<ChangeAvatarResponse> changeAvatar(@Header("Authorization") String token,
                                                  @Body ChangeAvatarRequest request);

    @POST("api/addaccount")
    Observable<AddAccountResponse> addAccount(@Header("Authorization") String token,
                                                @Body AddAccount request);

    @POST("api/removeaccount")
    Observable<ChangeAvatarResponse> removeAccount(@Header("Authorization") String token,
                                              @Body RemoveAccountRequest request);

    @POST("api/requestbulbsharemediauploadurl")
    Observable<BulbshareUploadUrlResponse> getAWSS3Credentials(@Header("Authorization") String token,
                                                               @Body BulbshareUploadUrlRequest request);

    @POST("api/confirmbulbsharemediaupload")
    Observable<ConfirmUploadedBulbshareResponse> getAWSS3UploadedDataResponse(@Header("Authorization") String token,
                                                                              @Body COnfirmUploadedBulbshareRequest request);

    @POST("api/submitbulbshare")
    Observable<SubmitBulbshareResponse> submitBulbshare(@Header("Authorization") String token,
                                                        @Body SubmitBulbshareRequest request);

    @POST("api/submitpollresponse")
    Observable<PollDataResponse> submitPollSurvey(@Header("Authorization") String token, @Body SubmitSurveyRequest request);

    @POST("api/getbulbsharesandthemebybrief")
    Observable<BulbshareBYBriefResponse> getBulbshareByBrief(@Header("Authorization") String token,
                                                             @Body BulbshareByBriefRequest request);

    @POST("api/unlikebulbshare")
    Observable<UnlikeBulbshareResponse> unlikeBulbshare(@Header("Authorization") String token,
                                                        @Body UnlikeBulbshareRequest request);

    @POST("api/likebulbshare")
    Observable<LikeBulbshareResponse> likeBulbshare(@Header("Authorization") String token,
                                                    @Body LIkeBulbshareRequest request);

    @POST("api/getallocatedrewards")
    Observable<RewardsResponse> getRewards(@Header("Authorization") String token, @Body RewardsRequest request);

    @POST("api/getallocatedrewards")
    Observable<RewardData> getRewardsById(@Header("Authorization") String token, @Body RewardsRequest request);

    @POST("api/reportinappropriatecontent")
    Observable<ReportInappropriateContentResponse> reportBulbshare(@Header("Authorization") String token,
                                                                   @Body ReportInappropriateContentRequest request);

    @POST("api/removebulbshare")
    Observable<DeleteBulbshareResponse> deleteBulbshare(@Header("Authorization") String token,
                                                        @Body DeleteBulbshareRequest request);
    @POST("api/getbulbsharesbybrief")
    Observable<BulbsharesByBriefResponse> getBulbsharesByBrief(@Header("Authorization") String token,
                                                               @Body BulbsharesByBriefRequest request);

    @POST("api/getbulbshare")
    Observable<BulbshareResponse> getBulbshare(@Header("Authorization") String token,
                                               @Body GetBulbshareRequest request);

    @POST("api/getbulbshareshareurl")
    Observable<GetSharableUrlResponse> getBulbshareSharableURL(@Header("Authorization") String token,
                                                               @Body GetSharableUrlRequest request);
    @POST("api/myfeedpe_bulbshares")
    Observable<GetBulbshareFeedResponse> getBulbshareFeed(@Header("Authorization") String token,
                                                          @Body GetBulbshareFeedRequest request);

    @POST("api/reportinappropriatecontent")
    Observable<ReportUserResponse> reportUser(@Header("Authorization") String token, @Body ReportUserRequest request);

    @POST("api/blockuser")
    Observable<BlockUserResponse> blockUser(@Header("Authorization") String token, @Body BlockUserRequest request);

    @POST("api/getbscomments")
    Observable<CommentsResponse> getBsComments(@Header("Authorization")String token, @Body BulbshareCommentRequest request);

    @POST("api/getbulbsharelikes")
    Observable<GetBriefLikesResponse> getBulbshareLikes(@Header("Authorization")String token, @Body BulbshareGetLikesRequest request);

}



