package com.example.taco.navigation
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taco.presentation.home.HomeScreen
import com.example.taco.presentation.home.HomeViewModel
import com.example.taco.presentation.product.ProductScreen

@Composable
fun AppNavigation(
    viewModel: HomeViewModel
) {
    val navController = rememberNavController()

    val uiState = viewModel.uiState.collectAsState().value

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                uiState = uiState,
                onTacoClick = { tacoId ->
                    navController.navigate("product/$tacoId")
                }
            )
        }

        composable("product/{tacoId}") {
            val tacoId = it.arguments
                ?.getString("tacoId")
                ?.toIntOrNull()

            val taco = uiState.tacos.find { taco ->
                taco.id == tacoId
            }

            if (taco != null) {
                ProductScreen(
                    taco = taco
                )
            }
        }
    }
}