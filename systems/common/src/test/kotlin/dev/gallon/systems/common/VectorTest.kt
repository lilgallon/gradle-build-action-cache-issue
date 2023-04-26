package dev.gallon.systems.common

import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class VectorTest : FunSpec({
    test("magnitude") {
        Vector(0.0, 0.0, 0.0).magnitude shouldBe 0.0
    }
})
