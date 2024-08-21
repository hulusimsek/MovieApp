package com.hulusimsek.a8_movieapp.data.remote

import com.hulusimsek.a8_movieapp.data.remote.dto.MoviesDetailDto
import com.hulusimsek.a8_movieapp.data.remote.dto.MoviesDto
import com.hulusimsek.a8_movieapp.util.Constans.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {
    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query ("apikey") apiKey: String = API_KEY
    ) : MoviesDto

    @GET(".")
    suspend fun getMovieDetails(
        @Query("i") imdbId: String,
        @Query ("apikey") apiKey: String = API_KEY
    ) : MoviesDetailDto
}