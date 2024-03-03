package com.example.pokeapp.di

import com.example.pokeapp.data.remote.api.PokemonService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.contextual
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient = HttpClient(Android) {
        install(Logging) {
            level = LogLevel.ALL
        }
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    isLenient = true
                }
            )
        }
    }

//    @Singleton
//    @Provides
//    fun provideMoshi(): Moshi = Moshi.Builder()
//        .addLast(KotlinJsonAdapterFactory())
//        .build()
//
////    @Singleton
////    @Provides
////    fun provideInterceptorWeatherApiKey() = Interceptor { chain ->
////        val request = chain.request()
////        val url = request.url().newBuilder()
////            .addQueryParameter("appid", "6c8a745c21f02472f186a66b96caeb44")
////            .addQueryParameter("country", "US")
////            .addQueryParameter("units","imperial")
////            .build()
////        val newRequest = request.newBuilder().url(url).build()
////        chain.proceed(newRequest)
////    }
//
//    @Singleton
//    @Provides
//    fun provideOkHttpClient(
////        interceptor: Interceptor
//    ): OkHttpClient = OkHttpClient.Builder()
////        .addInterceptor(interceptor)
//        .build()
//
//    @Singleton
//    @Provides
//    fun provideRetrofit(moshi: Moshi, okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
//        .baseUrl("https://pokeapi.co/api/v2/")
//        .client(okHttpClient)
//        .addConverterFactory(MoshiConverterFactory.create(moshi))
//        .build()
//
//    @Singleton
//    @Provides
//    fun provideWeatherService(retrofit: Retrofit): PokemonService =
//        retrofit.create(PokemonService::class.java)
}