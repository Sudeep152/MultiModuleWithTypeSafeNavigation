package com.shashank.feature.auth.ui.di

import com.shashank.feature.auth.ui.navigation.AuthFeatureNavigation
import com.shashank.feature.auth.ui.navigation.AuthFeatureNavigationImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AuthModule {

    @Provides
    fun provideAuthNavigationFeature(): AuthFeatureNavigation {
        return AuthFeatureNavigationImpl()
    }
}