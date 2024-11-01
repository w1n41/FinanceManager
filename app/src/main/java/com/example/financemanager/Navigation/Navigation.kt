package com.example.financemanager.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.financemanager.FinanceManagerViewModel.FinanceManagerViewModel
import com.example.financemanager.Screens.AccountScreen
import com.example.financemanager.Screens.MainScreen
import com.example.financemanager.Screens.MenuScreen

@Composable
fun Navigation(
    modifier: Modifier,
    navigationController: NavHostController,
    viewModel: FinanceManagerViewModel
) {
    NavHost(
        modifier = modifier,
        navController = navigationController,
        startDestination = Graph.MAIN_SCREEN
    ) {
        composable(route = Graph.MAIN_SCREEN){
            MainScreen(navigationController, viewModel)
        }
        composable(route = Graph.ACCOUNT_SCREEN){
            AccountScreen(navigationController, viewModel)
        }
        composable(route = Graph.MENU_SCREEN){
            MenuScreen(navigationController, viewModel)
        }
    }
}

object Graph{
    const val MAIN_SCREEN = "MainScreen"
    const val ACCOUNT_SCREEN = "AccountScreen"
    const val MENU_SCREEN = "MenuScreen"
}