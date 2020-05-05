package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1051

class LeetCode1051Test {

    @Test
    fun leetCode1051_Ex1_isCorrect() {
        val expected = 3
        val actual = LeetCode1051().heightChecker(heights = intArrayOf(1, 1, 4, 2, 1, 3))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1051_Ex2_isCorrect() {
        val expected = 5
        val actual = LeetCode1051().heightChecker(heights = intArrayOf(5, 1, 2, 3, 4))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1051_Ex3_isCorrect() {
        val expected = 0
        val actual = LeetCode1051().heightChecker(heights = intArrayOf(1, 2, 3, 4, 5))
        Assert.assertEquals(expected, actual)
    }
}