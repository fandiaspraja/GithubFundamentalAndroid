package com.fandiaspraja.core.domain.usecase

import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.Followers
import com.fandiaspraja.core.domain.model.Following
import com.fandiaspraja.core.domain.model.User
import com.fandiaspraja.core.domain.model.UserDetail
import com.fandiaspraja.core.domain.repository.IUserRepository
import kotlinx.coroutines.flow.Flow

class UserInteractor(private val iUserRepository: IUserRepository): UserUseCase {

    override suspend fun searchUsers(search: String, page : String, token: String): Flow<Resource<List<User>>> =
        iUserRepository.searchUsers(search, page, token)

    override suspend fun getDetailUser(
        username: String,
        token: String
    ): Flow<Resource<UserDetail>> =
        iUserRepository.getDetailUser(username, token)

    override suspend fun findAllUsergithub(): Flow<Resource<List<User>>> =
        iUserRepository.findAllUsergithub()

    override suspend fun findUsergithub(id: Int): Flow<Resource<UserDetail>> =
        iUserRepository.findUsergithub(id)

    override suspend fun insertUserFavorite(userDetail: UserDetail) =
        iUserRepository.insertUserFavorite(userDetail)

    override suspend fun deleteUsergithubByid(id: Int) =
        iUserRepository.deleteUsergithubByid(id)

    override suspend fun getFollowers(
        search: String,
        page: String,
        token: String
    ): Flow<Resource<List<Followers>>> =
        iUserRepository.getFollowers(search, page, token)

    override suspend fun getFollowings(
        search: String,
        page: String,
        token: String
    ): Flow<Resource<List<Following>>> =
        iUserRepository.getFollowings(search, page, token)

    override suspend fun getAllFollowers(id: Int): Flow<Resource<List<Followers>>> =
        iUserRepository.getAllFollowers(id)

    override suspend fun getAllFollowing(id: Int): Flow<Resource<List<Following>>> =
        iUserRepository.getAllFollowing(id)

    override suspend fun deleteFollowers(id: Int) =
        iUserRepository.deleteFollowers(id)

    override suspend fun deleteFollowing(id: Int) =
        iUserRepository.deleteFollowing(id)

    override suspend fun insertFollowers(id: Int, followers: List<Followers>) =
        iUserRepository.insertFollowers(id, followers)

    override suspend fun insertFollowing(id: Int, following: List<Following>) =
        iUserRepository.insertFollowing(id, following)
}