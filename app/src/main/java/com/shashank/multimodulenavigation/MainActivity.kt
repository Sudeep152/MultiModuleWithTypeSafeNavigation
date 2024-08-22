package com.shashank.multimodulenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.shashank.common.SubGraphRoute
import com.shashank.multimodulenavigation.ui.theme.MultiModuleNavigationTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var mDefaultNavigator: DefaultNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultiModuleNavigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainNavigation(
                        modifier = Modifier.padding(innerPadding),
                        defaultNavigator = mDefaultNavigator
                    )
                }
            }
        }
    }
}

@Composable
fun MainNavigation(modifier: Modifier = Modifier, defaultNavigator: DefaultNavigator) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SubGraphRoute.Auth) {
        defaultNavigator.authFeatureNavigation.registerGraph(navController, this)
        defaultNavigator.mainFeatureNavigation.registerGraph(navController,this)
    }
}