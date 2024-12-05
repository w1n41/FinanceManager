package com.example.financemanager.Screens

import android.R
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.financemanager.FinanceManagerViewModel.FinanceManagerViewModel
import com.example.financemanager.Navigation.Graph

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor",
    "StateFlowValueCalledInComposition"
)
@Composable
fun MainScreen(navHostController: NavHostController,viewModel: FinanceManagerViewModel) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        modifier = Modifier
                            .padding(2.dp)
                            .shadow(elevation = 10.dp, shape = RoundedCornerShape(20)),
                        text = "Main screen"
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        IconButton(
                            onClick = {
                                navHostController.navigate(Graph.MENU_SCREEN)
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

                                imageVector = Icons.Rounded.Menu,
                                contentDescription = ""
                            )
                        }
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
                                contentDescription = "Profile",
                            )
                        }
                    }
                }
            )
        }
    ) {}
}