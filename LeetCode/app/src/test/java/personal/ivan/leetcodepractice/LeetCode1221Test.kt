package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1221

class LeetCode1221Test {

    @Test
    fun leetCode1221_Ex1_isCorrect() {
        val expected = 4
        val actual = LeetCode1221().balancedStringSplit(s = "RLRRLLRLRL")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1221_Ex2_isCorrect() {
        val expected = 3
        val actual = LeetCode1221().balancedStringSplit(s = "RLLLLRRRLR")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1221_Ex3_isCorrect() {
        val expected = 1
        val actual = LeetCode1221().balancedStringSplit(s = "LLLLRRRR")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1221_Ex4_isCorrect() {
        val expected = 2
        val actual = LeetCode1221().balancedStringSplit(s = "RLRRRLLRLL")
        Assert.assertEquals(expected, actual)
    }
}