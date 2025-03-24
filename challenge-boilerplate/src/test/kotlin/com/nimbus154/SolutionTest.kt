package com.nimbus154

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    internal data class TestCase(
        val input: String,
        val expected: String,
    )

    companion object {
        @JvmStatic
        private fun getTestCases() = listOf(
            TestCase(
                "a",
                "a",
            ),
            TestCase(
                "b",
                "b",
            )
        )
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    internal fun `run test cases`(testCase: TestCase) {
        val actual = Solution().solve(testCase.input)
        Assertions.assertEquals(testCase.expected, actual)
    }
}