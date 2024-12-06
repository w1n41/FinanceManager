package com.example.financemanager.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.financemanager.financeManagerViewModel.FinanceManagerViewModel
import com.example.financemanager.screens.AccountScreen
import com.example.financemanager.screens.MainScreen
import com.example.financemanager.screens.MenuScreen

@Composable
fun Navigation(
    modifier: Modifier,
    navigationController: NavHostController,
    viewModel: FinanceManagerViewModel,
) {
    NavHost(
        modifier = modifier,
        navController = navigationController,
        startDestination = Graph.MAIN_SCREEN
    ) {
        composable(Graph.MAIN_SCREEN) {
            MainScreen(navigationController, viewModel)
        }
        composable(route = Graph.ACCOUNT_SCREEN) {
            AccountScreen(navigationController, viewModel)
        }
        composable(route = Graph.MENU_SCREEN) {
            MenuScreen(navigationController, viewModel)
        }
    }
}

object Graph {
    const val MAIN_SCREEN = "MainScreen"
    const val ACCOUNT_SCREEN = "AccountScreen"
    const val MENU_SCREEN = "MenuScreen"
}