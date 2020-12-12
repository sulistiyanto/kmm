package com.example.movieapp.movieApi.data.remote

import com.example.movieapp.movieApi.data.base.mapper.Mapper
import com.example.movieapp.movieApi.data.base.remote.Api
import com.example.movieapp.movieApi.data.entity.Movie
import com.example.movieapp.movieApi.data.entity.MoviesResponse
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class MoviesApiImpl(
    private val client: HttpClient,
    private val key: String,
    private val hostUrl: String,
    private val mapper: Mapper<MoviesResponse, List<Movie>>
) : Api<String, List<Movie>> {
    override suspend fun execute(request: String?): List<Movie> {
        val httpStatement = client.get<HttpStatement> {
            apiUrl()
            parameter("query", request)
        }
        val httpResponse = httpStatement.execute()

        val json = httpResponse.readText()

        val response = Json {
            ignoreUnknownKeys = true
            isLenient = true
        }.decodeFromString(MoviesResponse.serializer(), json)

        return mapper.mapTo(response)

    }

    private fun HttpRequestBuilder.apiUrl(path: String? = null) {
        header(HttpHeaders.CacheControl, "no-cache")
        url {
            takeFrom(hostUrl).parameters.append("api_key", key)
            path?.let {
                encodedPath = it
            }
        }
    }
}