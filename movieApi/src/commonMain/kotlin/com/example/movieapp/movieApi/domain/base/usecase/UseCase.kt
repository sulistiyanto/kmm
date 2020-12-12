package com.example.movieapp.movieApi.domain.base.usecase

interface UseCase<in R, T> {
    suspend fun execute(request: R?): T
}