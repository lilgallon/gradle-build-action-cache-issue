package dev.gallon.systems.common

import kotlin.math.sqrt

data class Vector(
    val x: Double,
    val y: Double,
    val z: Double,
) {

    val magnitude: Double
        get() = sqrt(x * x + y * y + z * z)
}
