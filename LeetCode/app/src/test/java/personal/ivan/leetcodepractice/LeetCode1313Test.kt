package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1313

class LeetCode1313Test {

    @Test
    fun leetCode1313_Ex1_isCorrect() {
        val expected = intArrayOf(2, 4, 4, 4)
        val actual = LeetCode1313().decompressRLElist(intArrayOf(1, 2, 3, 4))
        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun leetCode1313_Ex2_isCorrect() {
        val expected = intArrayOf(1, 3, 3)
        val actual = LeetCode1313().decompressRLElist(intArrayOf(1, 1, 2, 3))
        Assert.assertArrayEquals(expected, actual)
    }
}