package com.shashank.common

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController


interface Feature {
    fun registerGraph(navController: NavHostController,navGraphBuilder: NavGraphBuilder)
}