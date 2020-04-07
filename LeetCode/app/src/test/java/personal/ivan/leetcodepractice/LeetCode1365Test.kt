package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1365

class LeetCode1365Test {

    @Test
    fun leetCode1365_Ex1_isCorrect() {
        val expected = intArrayOf(4, 0, 1, 1, 3)
        val actual = LeetCode1365().smallerNumbersThanCurrent(nums = intArrayOf(8, 1, 2, 2, 3))
        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun leetCode1365_Ex2_isCorrect() {
        val expected = intArrayOf(2, 1, 0, 3)
        val actual = LeetCode1365().smallerNumbersThanCurrent(nums = intArrayOf(6, 5, 4, 8))
        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun leetCode1365_Ex3_isCorrect() {
        val expected = intArrayOf(0, 0, 0, 0)
        val actual = LeetCode1365().smallerNumbersThanCurrent(nums = intArrayOf(7, 7, 7, 7))
        Assert.assertArrayEquals(expected, actual)
    }
}