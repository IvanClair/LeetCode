package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode7

class LeetCode7Test {

    @Test
    fun leetCode7_Ex1_isCorrect() {
        val expected = 321
        val actual = LeetCode7().reverse(x = 123)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode7_Ex2_isCorrect() {
        val expected = -321
        val actual = LeetCode7().reverse(x = -123)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode7_Ex3_isCorrect() {
        val expected = 21
        val actual = LeetCode7().reverse(x = 120)
        Assert.assertEquals(expected, actual)
    }
}