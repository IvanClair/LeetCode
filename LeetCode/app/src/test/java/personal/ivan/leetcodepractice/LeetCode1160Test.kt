package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1160

class LeetCode1160Test {

    @Test
    fun leetCode1160_Ex1_isCorrect() {
        val expected = 6
        val actual =
            LeetCode1160().countCharacters(
                words = arrayOf("cat", "bt", "hat", "tree"),
                chars = "atach"
            )
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1160_Ex2_isCorrect() {
        val expected = 10
        val actual =
            LeetCode1160().countCharacters(
                words = arrayOf("hello", "world", "leetcode"),
                chars = "welldonehoneyr"
            )
        Assert.assertEquals(expected, actual)
    }
}