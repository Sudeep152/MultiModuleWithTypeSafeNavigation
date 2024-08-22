package com.shashank.feature.auth.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.shashank.common.Destination
import com.shashank.common.Feature
import com.shashank.common.SubGraphRoute
import com.shashank.feature.auth.ui.screen.AuthScreen
import javax.inject.Inject

interface AuthFeatureNavigation : Feature {}

class AuthFeatureNavigationImpl : AuthFeatureNavigation {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation<SubGraphRoute.Auth>(startDestination = Destination.Auth) {
            composable<Destination.Auth> {
                AuthScreen {
                   navController.navigate(Destination.Dashboard)
                }
            }
        }
    }

}