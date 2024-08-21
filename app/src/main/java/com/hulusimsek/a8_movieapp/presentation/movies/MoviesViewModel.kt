package com.hulusimsek.a8_movieapp.presentation.movies

import androidx.lifecycle.ViewModel
import com.hulusimsek.a8_movieapp.domain.use_case.get_movies.GetMovieUseCase
import javax.inject.Inject

class MoviesViewModel @Inject constructor(
    private val getMovieUseCase: GetMovieUseCase
) : ViewModel() {


}