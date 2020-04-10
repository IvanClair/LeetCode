package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode367

class LeetCode367Test {

    @Test
    fun leetCode367_Ex1_isCorrect() {
        val expected = true
        val actual = LeetCode367().isPerfectSquare(num = 16)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode367_Ex2_isCorrect() {
        val expected = false
        val actual = LeetCode367().isPerfectSquare(num = 14)
        Assert.assertEquals(expected, actual)
    }
}