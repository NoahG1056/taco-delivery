package com.example.taco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.taco.app.TacoApp
import com.example.taco.navigation.AppNavigation
import com.example.taco.presentation.home.HomeViewModel


class MainActivity : ComponentActivity() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val app = application as TacoApp

        viewModel = HomeViewModel(
            getTacosUseCase = app.appContainer.getTacosUseCase
        )

        setContent {
            AppNavigation(
                viewModel = viewModel
            )
        }
    }
}
