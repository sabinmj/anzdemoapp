package com.sabin.anzdemoapp.data.repository

import com.sabin.anzdemoapp.data.model.SpaceXLaunchesModel
import com.sabin.anzdemoapp.data.api.GetSpaceXApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SpaceXLaunchesRepository @Inject constructor(private val apiService: GetSpaceXApiService){
    fun getLaunches(limit: String) : Flow<List<SpaceXLaunchesModel>> {
        return flow {
            emit(apiService.getAllLaunches(limit))
        }
    }
}