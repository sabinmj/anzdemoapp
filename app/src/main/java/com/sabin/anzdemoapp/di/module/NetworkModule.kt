package com.sabin.anzdemoapp.di.module

import com.sabin.anzdemoapp.data.api.GetSpaceXApiService
import com.sabin.anzdemoapp.di.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @BaseUrl
    @Provides
    fun provideBaseUrl() = "https://api.spacexdata.com/"

    @Provides
    @Singleton
    fun provideGsonConverterFactory(): GsonConverterFactory = GsonConverterFactory.create()

    @Provides
    fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)


    @Provides
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor) = OkHttpClient()
        .newBuilder()
        .addInterceptor(loggingInterceptor)
        .build()


    @Provides
    fun provideRetrofitClient(
        @BaseUrl baseUrl: String,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(gsonConverterFactory)
        .build()

    @Provides
    fun provideSpaceXApiService(retrofit: Retrofit): GetSpaceXApiService {
        return retrofit.create(GetSpaceXApiService::class.java)
    }

}