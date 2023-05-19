package com.sabin.anzdemoapp.data.api

import com.sabin.anzdemoapp.data.model.SpaceXLaunchesModel
import retrofit2.http.GET
import retrofit2.http.Query

interface GetSpaceXApiService {
    @GET("v3/launches")
    suspend fun getAllLaunches(
        @Query("limit") limit: String
    ): List<SpaceXLaunchesModel>
}