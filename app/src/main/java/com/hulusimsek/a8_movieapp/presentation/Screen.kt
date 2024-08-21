package com.hulusimsek.a8_movieapp.presentation

sealed class Screen (val route : String){
    object MovieScreen : Screen("movieScreen")
    object MovieDetailScreen: Screen("movieDetailScreen")
}