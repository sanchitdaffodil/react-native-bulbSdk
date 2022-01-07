package com.example.networkmanger.repomanager

import datamanager.request.BlockUserRequest
import datamanager.response.BlockUserResponse
import io.reactivex.Observable

interface IBlockUserRepo {

    fun blockUser(blockUserRequest: BlockUserRequest, token:String): Observable<BlockUserResponse>
}