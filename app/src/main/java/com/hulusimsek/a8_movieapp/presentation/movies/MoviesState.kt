package com.hulusimsek.a8_movieapp.presentation.movies

import com.hulusimsek.a8_movieapp.data.remote.dto.Search
import com.hulusimsek.a8_movieapp.domain.model.Movie
import com.hulusimsek.a8_movieapp.util.Resource

data class MoviesState (
    val isLoading: Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search: String = ""
) {
}