package com.fandiaspraja.githubfundamentalandroid.core.data.repository

import com.fandiaspraja.githubfundamentalandroid.core.data.Resource
import com.fandiaspraja.githubfundamentalandroid.core.data.local.LocalDataSource
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.FollowersEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.FollowingEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.UserEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.RemoteDataSource
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.network.ApiResponse
import com.fandiaspraja.githubfundamentalandroid.core.domain.model.Followers
import com.fandiaspraja.githubfundamentalandroid.core.domain.model.Following
import com.fandiaspraja.githubfundamentalandroid.core.domain.model.User
import com.fandiaspraja.githubfundamentalandroid.core.domain.model.UserDetail
import com.fandiaspraja.githubfundamentalandroid.core.domain.repository.IUserRepository
import com.fandiaspraja.githubfundamentalandroid.core.utils.AppExecutors
import com.fandiaspraja.githubfundamentalandroid.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow

class GithubRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
): IUserRepository {

    override suspend fun searchUsers(search: String, page : String, token: String): Flow<Resource<List<User>>> {
        return flow {
            var dataUser = arrayListOf<User>()

            try {
                when(val it = remoteDataSource.searchUsers(search, page, token).first()){
                    is ApiResponse.Success -> {
                        dataUser.addAll(DataMapper.mapResponseUserToDomain(it.data))
                        emit(Resource.Success(dataUser.toList()))
                    }
                    is ApiResponse.Empty -> {
                        emit(Resource.Success(dataUser.toList()))
                    }
                    is ApiResponse.Error -> {
                        emit(Resource.Error(it.errorMessage, dataUser.toList()))
                    }
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    override suspend fun getDetailUser(
        username: String,
        token: String
    ): Flow<Resource<UserDetail>> {
        return flow {
            var userDetail = UserDetail()

            try {
                when(val it = remoteDataSource.getDetailUser(username, token).first()){
                    is ApiResponse.Success -> {
                        userDetail = DataMapper.mapResponseUserDetailToDomain(it.data)
                        emit(Resource.Success(userDetail))
                    }
                    is ApiResponse.Empty -> {
                        emit(Resource.Success(userDetail))
                    }
                    is ApiResponse.Error -> {
                        emit(Resource.Error(it.errorMessage, userDetail))
                    }
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    override suspend fun findAllUsergithub(): Flow<Resource<List<User>>> {
        return flow {
            var dataUser = arrayListOf<User>()

            try {

                val it = localDataSource.findAllUsergithub().first()

                if (it != null){
                    if (it.size != 0){
                        dataUser.addAll(DataMapper.mapUserEntityToDomain(it))
                        emit(Resource.Success(dataUser.toList()))
                    }else{
                        emit(Resource.Success(dataUser.toList()))
                    }
                }else{
                    emit(Resource.Success(dataUser.toList()))
                }

            }catch (e: Exception){
                emit(Resource.Error(e.message!!, dataUser.toList()))
                e.printStackTrace()
            }
        }
    }

    override suspend fun findUsergithub(id: Int): Flow<Resource<UserDetail>> {
        return flow {
            var userDetail = UserDetail()

            try {

                val it = localDataSource.findUsergithub(id).first()

                if (it != null){
                    userDetail = DataMapper.mapUserDetailEntityToDomain(it)
                    emit(Resource.Success(userDetail))
                }else{
                    emit(Resource.Success(userDetail))
                }

            }catch (e: Exception){
                emit(Resource.Error(e.message!!, userDetail))
                e.printStackTrace()
            }
        }
    }

    override suspend fun insertUserFavorite(userDetail : UserDetail) {
        try {
            var userEntity = DataMapper.mapDomainToUserDetailEntity(userDetail)
            localDataSource.insertUserFavorite(userEntity)
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    override suspend fun deleteUsergithubByid(id: Int) {
        try {
            localDataSource.deleteUsergithubByid(id)
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    override suspend fun getFollowers(
        search: String,
        page: String,
        token: String
    ): Flow<Resource<List<Followers>>> {
        return flow {
            var dataUser = arrayListOf<Followers>()

            try {
                when(val it = remoteDataSource.getFollowers(search, page, token).first()){
                    is ApiResponse.Success -> {
                        dataUser.addAll(DataMapper.mapResponseFollowersToDomain(it.data))
                        emit(Resource.Success(dataUser.toList()))
                    }
                    is ApiResponse.Empty -> {
                        emit(Resource.Success(dataUser.toList()))
                    }
                    is ApiResponse.Error -> {
                        emit(Resource.Error(it.errorMessage, dataUser.toList()))
                    }
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    override suspend fun getFollowings(
        search: String,
        page: String,
        token: String
    ): Flow<Resource<List<Following>>> {
        return flow {
            var dataUser = arrayListOf<Following>()

            try {
                when(val it = remoteDataSource.getFollowings(search, page, token).first()){
                    is ApiResponse.Success -> {
                        dataUser.addAll(DataMapper.mapResponseFollowingToDomain(it.data))
                        emit(Resource.Success(dataUser.toList()))
                    }
                    is ApiResponse.Empty -> {
                        emit(Resource.Success(dataUser.toList()))
                    }
                    is ApiResponse.Error -> {
                        emit(Resource.Error(it.errorMessage, dataUser.toList()))
                    }
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    override suspend fun getAllFollowers(id: Int): Flow<Resource<List<Followers>>> {
        return flow {
            var dataUser = arrayListOf<Followers>()

            try {

                val it = localDataSource.getAllFollowers(id).first()

                if (it != null){
                    if (it.size != 0){
                        dataUser.addAll(DataMapper.mapFollowersEntityToDomain(it))
                        emit(Resource.Success(dataUser.toList()))
                    }else{
                        emit(Resource.Success(dataUser.toList()))
                    }
                }else{
                    emit(Resource.Success(dataUser.toList()))
                }

            }catch (e: Exception){
                emit(Resource.Error(e.message!!, dataUser.toList()))
                e.printStackTrace()
            }
        }
    }

    override suspend fun getAllFollowing(id: Int): Flow<Resource<List<Following>>> {
        return flow {
            var dataUser = arrayListOf<Following>()

            try {

                val it = localDataSource.getAllFollowing(id).first()

                if (it != null){
                    if (it.size != 0){
                        dataUser.addAll(DataMapper.mapFollowingEntityToDomain(it))
                        emit(Resource.Success(dataUser.toList()))
                    }else{
                        emit(Resource.Success(dataUser.toList()))
                    }
                }else{
                    emit(Resource.Success(dataUser.toList()))
                }

            }catch (e: Exception){
                emit(Resource.Error(e.message!!, dataUser.toList()))
                e.printStackTrace()
            }
        }
    }

    override suspend fun deleteFollowers(id: Int) {
        try {
            localDataSource.deleteFollowers(id)
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    override suspend fun deleteFollowing(id: Int) {
        try {
            localDataSource.deleteFollowing(id)
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    override suspend fun insertFollowers(id: Int, followers: List<Followers>) {
        try {
            var followersEntity = DataMapper.mapDomainToFollowersEntity(id, followers)
            localDataSource.insertFollowers(followersEntity)
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    override suspend fun insertFollowing(id: Int, following: List<Following>) {
        try {
            var followingsEntity = DataMapper.mapDomainToFollowingEntity(id, following)
            localDataSource.insertFollowing(followingsEntity)
        }catch (e: Exception){
            e.printStackTrace()
        }
    }


}