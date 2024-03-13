package com.example.pokeapp.domain.usecases.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

abstract class UseCaseTwo<T, in Input1, in Input2>(private val background: CoroutineDispatcher) {
    protected abstract suspend fun run(input1: Input1? = null, input2: Input2? = null) : T

    suspend operator fun invoke(input1: Input1? = null, input2: Input2? = null): Response<T> = withContext(background) {
        try {
            Response.Success(run(input1, input2))
        } catch (error: Exception) {
            Response.Failure(error)
        }
    }
}