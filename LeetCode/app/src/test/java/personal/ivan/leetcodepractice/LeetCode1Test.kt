package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1

class LeetCode1Test {

    @Test
    fun leetCode1_Ex1_isCorrect() {
        val expected = intArrayOf(0, 1)
        val actual = LeetCode1().twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)
        Assert.assertArrayEquals(expected, actual)
    }
}