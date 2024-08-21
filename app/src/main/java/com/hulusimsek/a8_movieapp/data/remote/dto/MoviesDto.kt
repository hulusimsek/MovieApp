package com.hulusimsek.a8_movieapp.data.remote.dto

import com.hulusimsek.a8_movieapp.domain.model.Movie

data class MoviesDto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

fun MoviesDto.toMovieList() : List<Movie> {
    return Search.map { search -> Movie(search.Poster, search.Title, search.Year, search.imdbID) }
}