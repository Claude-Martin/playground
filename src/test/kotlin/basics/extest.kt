// src/test/kotlin/basics/extest.kt
import kotlin.test.Test
import kotlin.test.assertEquals

class ExerciseTest {
    @Test fun `sum of list`() = assertEquals(6, listOf(1, 2, 3).sum())
}

