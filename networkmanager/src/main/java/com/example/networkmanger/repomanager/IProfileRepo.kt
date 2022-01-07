package com.example.networkmanger.repomanager

import datamanager.request.profile.*
import datamanager.response.profile.*
import io.reactivex.Observable

interface IProfileRepo {

    fun getMyProfile(req: ProfileRequest, token: String): Observable<ProfileResponse>

    fun getBulbsharesByUser(req: UserBulbsharesRequest, token: String): Observable<UserBulbsharesResponse>

    fun getBrandsByUser(req: UserBulbsharesRequest, token: String): Observable<UserBrandsResponse>

    fun changeAvatar(req: ChangeAvatarRequest, token: String): Observable<ChangeAvatarResponse>

    fun addAccount(req: AddAccount, token: String): Observable<AddAccountResponse>

    fun removeAccount(req: RemoveAccountRequest, token: String): Observable<ChangeAvatarResponse>
}