package com.example.taco.presentation.home

import com.example.taco.domain.model.Taco

data class HomeUiState(
    val tacos: List<Taco> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)