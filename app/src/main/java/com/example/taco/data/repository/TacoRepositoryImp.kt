package com.example.taco.data.repository

import com.example.taco.domain.model.Taco
import com.example.taco.domain.repository.TacoRepository

class TacoRepositoryImpl : TacoRepository {

    override suspend fun getTacos(): List<Taco> {
        return listOf(
            Taco(
                id = 1,
                name = "Beef Taco",
                description = "Говядина, сыр, салса и свежие овощи",
                price = 12.0
            ),
            Taco(
                id = 2,
                name = "Chicken Taco",
                description = "Курица, сыр, салат и фирменный соус",
                price = 10.0
            ),
            Taco(
                id = 3,
                name = "Spicy Taco",
                description = "Острая говядина, халапеньо и сыр",
                price = 13.0
            )
        )
    }
}