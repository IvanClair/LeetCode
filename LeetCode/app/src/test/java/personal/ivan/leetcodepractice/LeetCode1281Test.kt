package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1281

class LeetCode1281Test {

    @Test
    fun leetCode1281_Ex1_isCorrect() {
        val expected = 15
        val actual = LeetCode1281().subtractProductAndSum(234)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1281_Ex2_isCorrect() {
        val expected = 21
        val actual = LeetCode1281().subtractProductAndSum(4421)
        Assert.assertEquals(expected, actual)
    }
}