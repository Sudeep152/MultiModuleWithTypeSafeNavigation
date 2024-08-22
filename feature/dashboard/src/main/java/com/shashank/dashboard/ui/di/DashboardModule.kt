package com.shashank.dashboard.ui.di

import com.shashank.dashboard.ui.navigation.DashBoardNavigationImpl
import com.shashank.dashboard.ui.navigation.DashboardNavigation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object DashboardModule {

    @Provides
    fun provideDashboardNavigation(): DashboardNavigation {
        return DashBoardNavigationImpl()
    }
}