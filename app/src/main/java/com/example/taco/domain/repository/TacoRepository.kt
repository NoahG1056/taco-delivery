package com.example.taco.domain.repository

import com.example.taco.domain.model.Taco

interface TacoRepository {
    suspend fun getTacos(): List<Taco>
}