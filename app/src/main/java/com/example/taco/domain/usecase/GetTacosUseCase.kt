package com.example.taco.domain.usecase

import com.example.taco.domain.model.Taco
import com.example.taco.domain.repository.TacoRepository

class GetTacosUseCase(
    private val tacoRepository: TacoRepository
) {

    suspend operator fun invoke(): List<Taco> {
        return tacoRepository.getTacos()
    }
}