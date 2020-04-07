package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1342

class LeetCode1342Test {

    @Test
    fun leetCode1342_Ex1_isCorrect() {
        val expected = 6
        val actual = LeetCode1342().numberOfSteps(14)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1342_Ex2_isCorrect() {
        val expected = 4
        val actual = LeetCode1342().numberOfSteps(8)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1342_Ex3_isCorrect() {
        val expected = 12
        val actual = LeetCode1342().numberOfSteps(123)
        Assert.assertEquals(expected, actual)
    }
}