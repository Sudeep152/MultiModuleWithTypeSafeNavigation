package com.shashank.multimodulenavigation

import com.shashank.dashboard.ui.navigation.DashboardNavigation
import com.shashank.feature.auth.ui.navigation.AuthFeatureNavigation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideAppNavigation(
        authNavigation: AuthFeatureNavigation,
        dashboardNavigation: DashboardNavigation
    ): DefaultNavigator {
        return DefaultNavigator(authNavigation, dashboardNavigation)
    }
}