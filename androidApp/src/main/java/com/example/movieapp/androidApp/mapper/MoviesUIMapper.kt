package com.example.movieapp.androidApp.mapper

import com.example.movieapp.movieApi.data.base.mapper.Mapper
import com.example.movieapp.movieApi.data.entity.Movie

class MoviesUIMapper : Mapper<List<Movie>, List<Movie>> {

    override fun mapTo(response: List<Movie>): List<Movie> = response.map {
        Movie(
            popularity = it.popularity,
            voteCount = it.voteCount,
            video = it.video,
            posterPath = it.posterPath,
            id = it.id,
            adult = it.adult,
            backdropPath = it.backdropPath,
            originalLanguage = it.originalLanguage,
            originalTitle = it.originalTitle,
            genreIds = it.genreIds,
            title = it.title,
            voteAverage = it.voteAverage,
            overview = it.overview,
            releaseDate = it.releaseDate,
            fullPosterPath = it.fullPosterPath
        )
    }

}