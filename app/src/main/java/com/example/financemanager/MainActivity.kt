package com.example.financemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.financemanager.financeManagerViewModel.FinanceManagerViewModel
import com.example.financemanager.navigation.Navigation
import com.example.financemanager.ui.theme.FinanceManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            FinanceManagerTheme(darkTheme = true) {
                val navHostController = rememberNavController()
                Scaffold { padding ->
                    Navigation(modifier = Modifier.padding(padding), navigationController = navHostController, viewModel = FinanceManagerViewModel())
                }
            }
        }
    }
}
