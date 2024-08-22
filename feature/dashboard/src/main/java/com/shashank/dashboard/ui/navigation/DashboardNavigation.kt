package com.shashank.dashboard.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.shashank.common.Destination
import com.shashank.common.Feature
import com.shashank.common.SubGraphRoute
import com.shashank.dashboard.ui.screen.DashboardScreen
import javax.inject.Inject

interface DashboardNavigation : Feature {}


class DashBoardNavigationImpl : DashboardNavigation {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation<SubGraphRoute.Dashboard>(startDestination = Destination.Dashboard) {
            composable<Destination.Dashboard> {
                DashboardScreen()
            }
        }
    }
}