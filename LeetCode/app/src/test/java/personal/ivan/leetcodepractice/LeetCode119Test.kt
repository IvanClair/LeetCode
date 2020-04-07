package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1119

class LeetCode119Test {

    @Test
    fun leetCode1119_Ex1_isCorrect() {
        val expected = "ltcdscmmntyfrcdrs"
        val actual = LeetCode1119().removeVowels(input = "leetcodeisacommunityforcoders")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1119_Ex2_isCorrect() {
        val expected = ""
        val actual = LeetCode1119().removeVowels(input = "aeiou")
        Assert.assertEquals(expected, actual)
    }
}