package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1389

class LeetCode1389Test {

    @Test
    fun leetCode1389_Ex1_isCorrect() {
        val expected = intArrayOf(0, 4, 1, 3, 2)
        val actual = LeetCode1389().createTargetArray(
            nums = intArrayOf(0, 1, 2, 3, 4),
            index = intArrayOf(0, 1, 2, 2, 1)
        )
        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun leetCode1389_Ex2_isCorrect() {
        val expected = intArrayOf(0, 1, 2, 3, 4)
        val actual = LeetCode1389().createTargetArray(
            nums = intArrayOf(1, 2, 3, 4, 0),
            index = intArrayOf(0, 1, 2, 3, 0)
        )
        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun leetCode1389_Ex3_isCorrect() {
        val expected = intArrayOf(1)
        val actual = LeetCode1389().createTargetArray(
            nums = intArrayOf(1),
            index = intArrayOf(0)
        )
        Assert.assertArrayEquals(expected, actual)
    }
}