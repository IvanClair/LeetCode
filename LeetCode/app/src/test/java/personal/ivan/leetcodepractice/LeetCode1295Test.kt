package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1295

class LeetCode1295Test {

    @Test
    fun leetCode1295_Ex1_isCorrect() {
        val expected = 2
        val actual = LeetCode1295().findNumbers(intArrayOf(12, 345, 2, 6, 7896))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1295_Ex2_isCorrect() {
        val expected = 1
        val actual = LeetCode1295().findNumbers(intArrayOf(555, 901, 482, 1771))
        Assert.assertEquals(expected, actual)
    }
}