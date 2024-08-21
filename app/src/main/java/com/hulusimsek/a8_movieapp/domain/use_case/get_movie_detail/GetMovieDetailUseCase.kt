package com.hulusimsek.a8_movieapp.domain.use_case.get_movie_detail

import coil.network.HttpException
import com.hulusimsek.a8_movieapp.data.remote.dto.toMovieDetail
import com.hulusimsek.a8_movieapp.data.remote.dto.toMovieList
import com.hulusimsek.a8_movieapp.domain.model.Movie
import com.hulusimsek.a8_movieapp.domain.model.MovieDetail
import com.hulusimsek.a8_movieapp.domain.repository.MovieRepository
import com.hulusimsek.a8_movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(private val repository: MovieRepository) {
    fun executeGetMovies(imdbId: String) : Flow<Resource<MovieDetail>> {
        return flow {
            try {
                emit(Resource.Loading())
                val movieList = repository.getMovieDetail(imdbId)
                emit(Resource.Success(movieList.toMovieDetail()))

            } catch (e : IOError) {
                emit(Resource.Error(message = "No internet connection"))
            } catch (e: HttpException) {
                emit(Resource.Error(message = e.localizedMessage ?: "Error"))
            }
        }
    }
}