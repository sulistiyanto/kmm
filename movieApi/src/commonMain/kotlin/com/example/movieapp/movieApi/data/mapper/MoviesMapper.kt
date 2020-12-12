package com.example.movieapp.movieApi.data.mapper

import com.example.movieapp.movieApi.data.base.mapper.Mapper
import com.example.movieapp.movieApi.data.entity.Movie
import com.example.movieapp.movieApi.data.entity.MoviesResponse

class MoviesMapper : Mapper<MoviesResponse, List<Movie>> {
    override fun mapTo(response: MoviesResponse): List<Movie> = response.results.map {
        Movie(
            popularity = it.popularity,
            voteCount = it.voteCount,
            video = it.video,
            posterPath = it.posterPath ?: "",
            id = it.id,
            adult = it.adult,
            backdropPath = it.backdropPath ?: "",
            originalLanguage = it.originalLanguage,
            originalTitle = it.originalTitle,
            genreIds = it.genreIds,
            title = it.title,
            voteAverage = it.voteAverage,
            overview = it.overview,
            releaseDate = it.releaseDate
        )
    }
}