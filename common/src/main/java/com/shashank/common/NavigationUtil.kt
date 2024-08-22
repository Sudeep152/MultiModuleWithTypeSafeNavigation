package com.shashank.common

import kotlinx.serialization.Serializable

sealed class SubGraphRoute {
    @Serializable
    data object Auth : SubGraphRoute()

    @Serializable
    data object Dashboard : SubGraphRoute()

}

sealed class Destination {
    @Serializable
    data object Auth : Destination()

    @Serializable
    data object Dashboard : Destination()
}