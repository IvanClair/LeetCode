package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode771

/**
 * [LeetCode771]
 */
class LeetCode771Test {

    @Test
    fun leetCode771_Ex1_isCorrect() {
        val expected = 3
        val actual = LeetCode771().numJewelsInStones(J = "aA", S = "aAAbbbb")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode771_Ex2_isCorrect() {
        val expected = 0
        val actual = LeetCode771().numJewelsInStones(J = "z", S = "ZZ")
        Assert.assertEquals(expected, actual)
    }
}