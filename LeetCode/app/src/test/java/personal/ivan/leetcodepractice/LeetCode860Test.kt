package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode860

class LeetCode860Test {

    @Test
    fun leetCode892_Ex1_isCorrect() {
        val expected = true
        val actual = LeetCode860().lemonadeChange(bills = intArrayOf(5, 5, 5, 10, 20))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode892_Ex2_isCorrect() {
        val expected = true
        val actual = LeetCode860().lemonadeChange(bills = intArrayOf(5, 5, 10))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode892_Ex3_isCorrect() {
        val expected = false
        val actual = LeetCode860().lemonadeChange(bills = intArrayOf(10, 10))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode892_Ex4_isCorrect() {
        val expected = false
        val actual = LeetCode860().lemonadeChange(bills = intArrayOf(5, 5, 10, 10, 20))
        Assert.assertEquals(expected, actual)
    }
}