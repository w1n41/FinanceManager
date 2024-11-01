package com.example.financemanager.Screens

import android.R
import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.financemanager.FinanceManagerViewModel.FinanceManagerViewModel
import com.example.financemanager.Navigation.Graph
import org.w3c.dom.Text

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
                                            color = colorResource(R.color.white),
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
                                            color = colorResource(R.color.white),
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
                                            color = colorResource(R.color.white),
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


