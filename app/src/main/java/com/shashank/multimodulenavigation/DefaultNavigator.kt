package com.shashank.multimodulenavigation

import com.shashank.dashboard.ui.navigation.DashboardNavigation
import com.shashank.feature.auth.ui.navigation.AuthFeatureNavigation


data class DefaultNavigator(
    val authFeatureNavigation: AuthFeatureNavigation,
    val mainFeatureNavigation: DashboardNavigation
)