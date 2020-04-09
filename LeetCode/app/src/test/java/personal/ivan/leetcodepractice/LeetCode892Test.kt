package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode892

class LeetCode892Test {

    @Test
    fun leetCode892_Ex1_isCorrect() {
        val expected = 10
        val actual = LeetCode892().surfaceArea(grid = arrayOf(intArrayOf(2)))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode892_Ex2_isCorrect() {
        val expected = 34
        val actual = LeetCode892().surfaceArea(grid = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode892_Ex3_isCorrect() {
        val expected = 16
        val actual = LeetCode892().surfaceArea(grid = arrayOf(intArrayOf(1, 0), intArrayOf(0, 2)))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode892_Ex4_isCorrect() {
        val expected = 32
        val actual = LeetCode892().surfaceArea(
            grid = arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1)
            )
        )
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode892_Ex5_isCorrect() {
        val expected = 46
        val actual = LeetCode892().surfaceArea(
            grid = arrayOf(
                intArrayOf(2, 2, 2),
                intArrayOf(2, 1, 2),
                intArrayOf(2, 2, 2)
            )
        )
        Assert.assertEquals(expected, actual)
    }
}