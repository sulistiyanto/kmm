package com.example.movieapp.movieApi.data.repository

import com.example.movieapp.movieApi.data.base.remote.Api
import com.example.movieapp.movieApi.data.entity.Movie
import com.example.movieapp.movieApi.domain.base.repository.Repository

class MoviesRepositoryImpl<R>(
    private val api: Api<R, List<Movie>>
) : Repository<R, List<Movie>> {
    override suspend fun get(request: R?): List<Movie> = api.execute(request)
}