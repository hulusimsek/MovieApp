package com.hulusimsek.a8_movieapp.data.dependyinjection

import com.hulusimsek.a8_movieapp.data.remote.MovieAPI
import com.hulusimsek.a8_movieapp.data.repository.MovieRepositoryImpl
import com.hulusimsek.a8_movieapp.domain.repository.MovieRepository
import com.hulusimsek.a8_movieapp.util.Constans.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMovieApi() : MovieAPI {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideMovieRepository(api: MovieAPI) : MovieRepository{
        return MovieRepositoryImpl(api = api)
    }
}