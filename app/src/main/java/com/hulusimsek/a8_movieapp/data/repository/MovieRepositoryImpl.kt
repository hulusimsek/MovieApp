package com.hulusimsek.a8_movieapp.data.repository

import com.hulusimsek.a8_movieapp.data.remote.MovieAPI
import com.hulusimsek.a8_movieapp.data.remote.dto.MovieDetailDto
import com.hulusimsek.a8_movieapp.data.remote.dto.MoviesDto
import com.hulusimsek.a8_movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieAPI
) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetails(imdbId = imdbId)
    }

}