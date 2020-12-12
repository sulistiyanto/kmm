package com.example.movieapp.movieApi.domain.usecase

import com.example.movieapp.movieApi.data.entity.Movie
import com.example.movieapp.movieApi.domain.base.repository.Repository
import com.example.movieapp.movieApi.domain.base.usecase.UseCase

class GetMoviesUseCaseImpl<R>(
    private val repository: Repository<R, List<Movie>>
) : UseCase<R, List<Movie>> {

    override suspend fun execute(request: R?): List<Movie> {
        return repository.get(request)
    }

}