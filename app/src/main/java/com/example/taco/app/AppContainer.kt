package com.example.taco.app

import com.example.taco.data.repository.TacoRepositoryImpl
import com.example.taco.domain.repository.TacoRepository
import com.example.taco.domain.usecase.GetTacosUseCase

class AppContainer {

    private val tacoRepository: TacoRepository =
        TacoRepositoryImpl()

    val getTacosUseCase = GetTacosUseCase(
        tacoRepository = tacoRepository
    )
}