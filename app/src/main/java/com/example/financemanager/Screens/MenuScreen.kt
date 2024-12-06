package com.example.financemanager.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.financemanager.financeManagerViewModel.FinanceManagerViewModel
import com.example.financemanager.navigation.Graph
import com.example.financemanager.ui.theme.DarkColorScheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navHostController: NavHostController, viewModel: FinanceManagerViewModel){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text("Menu") }
                )
            },
            bottomBar = {


                BottomAppBar(
                    modifier = Modifier,
                    actions = {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            IconButton(
                                onClick = {},
                                modifier = Modifier
                                    .shadow(elevation = 20.dp, CircleShape)
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .background(
                                            color = DarkColorScheme.tertiary,
                                            shape = CircleShape
                                        )
                                        .padding(5.dp)
                                        .align(Alignment.CenterVertically),

                                    imageVector = Icons.Rounded.Menu,
                                    contentDescription = ""
                                )
                            }
                            IconButton(
                                onClick = {
                                    navHostController.navigate(Graph.MAIN_SCREEN)
                                },
                                modifier = Modifier
                                    .shadow(elevation = 20.dp, CircleShape)
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .background(
                                            color = DarkColorScheme.tertiary,
                                            shape = CircleShape
                                        )
                                        .padding(5.dp)
                                        .align(Alignment.CenterVertically),

                                    imageVector = Icons.Default.Home,
                                    contentDescription = "Home page"
                                )
                            }
                            IconButton(
                                onClick = {
                                    navHostController.navigate(Graph.ACCOUNT_SCREEN)
                                },
                                modifier = Modifier
                                    .shadow(elevation = 20.dp, CircleShape)
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .background(
                                            color = DarkColorScheme.tertiary,
                                            shape = CircleShape
                                        )
                                        .padding(5.dp)
                                        .align(Alignment.CenterVertically),

                                    imageVector = Icons.Default.Person,
                                    contentDescription = "Profile"
                                )
                            }
                        }
                    }
                )
            }
        ){innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(75.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.padding(10.dp),
                            text = "testCard1"
                        )
                    }
                }
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(75.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.padding(10.dp),
                            text = "testCard2"
                        )
                    }
                }
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(75.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.padding(10.dp),
                            text = "testCard3"
                        )
                    }
                }
            }
        }
    }
}


