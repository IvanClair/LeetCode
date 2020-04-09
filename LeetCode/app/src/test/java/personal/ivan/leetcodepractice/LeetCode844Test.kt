package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode844

class LeetCode844Test {

    @Test
    fun leetCode844_Ex1_isCorrect() {
        val expected = true
        val actual = LeetCode844().backspaceCompare(S = "ab#c", T = "ad#c")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode844_Ex2_isCorrect() {
        val expected = true
        val actual = LeetCode844().backspaceCompare(S = "ab##", T = "c#d#")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode844_Ex3_isCorrect() {
        val expected = true
        val actual = LeetCode844().backspaceCompare(S = "a##c", T = "#a#c")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode844_Ex4_isCorrect() {
        val expected = false
        val actual = LeetCode844().backspaceCompare(S = "a#c", T = "b")
        Assert.assertEquals(expected, actual)
    }
}