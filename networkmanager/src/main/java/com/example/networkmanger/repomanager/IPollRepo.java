package com.example.networkmanger.repomanager;

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
import datamanager.request.poll.ServerRequest;
import datamanager.request.poll.SubmitSurveyRequest;
import datamanager.request.poll.UnlikeBulbshareRequest;
import datamanager.response.BulbshareBYBriefResponse;
import datamanager.response.BulbshareResponse;
import datamanager.response.DeleteBulbshareResponse;
import datamanager.response.GetBulbshareFeedResponse;
import datamanager.response.PollDataResponse;
import datamanager.response.PollItemDataResult;
import datamanager.response.ReportInappropriateContentResponse;
import datamanager.response.SubmitBulbshareResponse;
import datamanager.response.UnlikeBulbshareResponse;
import datamanager.response.poll.BulbshareUploadUrlResponse;
import datamanager.response.poll.ConfirmUploadedBulbshareResponse;
import datamanager.response.poll.ConfirmUploadedMediaResponse;
import datamanager.response.poll.LikeBulbshareResponse;
import datamanager.response.poll.MediaUploadUrlResponse;
import datamanager.response.poll.PollResponse;
import io.reactivex.Observable;

public interface IPollRepo {

    Observable<PollResponse> getPoll(PollRequest req, String token);

    Observable<MediaUploadUrlResponse> getS3Credentials(MediaUploadUrlRequest request, String token);

    Observable<ConfirmUploadedMediaResponse> getS3UploadData(ConfirmUploadedMediaRequest request, String token);

    Observable<PollDataResponse> submitPoll(SubmitSurveyRequest req, String token);

    Observable<BulbshareUploadUrlResponse> getAWSS3Credentials(BulbshareUploadUrlRequest request, String token);

    Observable<ConfirmUploadedBulbshareResponse> getAWSS3UploadData(COnfirmUploadedBulbshareRequest request, String token);

    Observable<SubmitBulbshareResponse> submitBulbshare(SubmitBulbshareRequest request, String token);

    Observable<BulbshareBYBriefResponse> getBulbshareByBrief(BulbshareByBriefRequest request, String token);

    Observable<UnlikeBulbshareResponse> unlikeBulbshare(UnlikeBulbshareRequest request, String token);

    Observable<LikeBulbshareResponse> likeBulbshare(LIkeBulbshareRequest request, String token);

    Observable<ReportInappropriateContentResponse> reportBulbshare(ReportInappropriateContentRequest request, String token);

    Observable<DeleteBulbshareResponse> deleteBulbshare(DeleteBulbshareRequest request, String token);

    Observable<BulbshareResponse> getBulbshare(GetBulbshareRequest request, String token);

    Observable<GetBulbshareFeedResponse> getBulbshareFeed(GetBulbshareFeedRequest request, String token);


}
