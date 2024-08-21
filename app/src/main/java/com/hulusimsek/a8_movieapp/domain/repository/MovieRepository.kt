package com.hulusimsek.a8_movieapp.domain.repository

import com.hulusimsek.a8_movieapp.data.remote.dto.MovieDetailDto
import com.hulusimsek.a8_movieapp.data.remote.dto.MoviesDto
import com.hulusimsek.a8_movieapp.data.remote.dto.Search

interface MovieRepository {
    suspend fun getMovies(search: String) : MoviesDto
    suspend fun getMovieDetail(imdbId: String) : MovieDetailDto
}