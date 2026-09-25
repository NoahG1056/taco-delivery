package com.example.taco.domain.model

data class Taco(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String? = null
)