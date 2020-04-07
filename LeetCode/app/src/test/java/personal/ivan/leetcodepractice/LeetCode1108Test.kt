package personal.ivan.leetcodepractice

import org.junit.Assert
import org.junit.Test
import personal.ivan.leetcodepractice.easy.LeetCode1108

class LeetCode1108Test {

    @Test
    fun leetCode1108_Ex1_isCorrect() {
        val expected = "1[.]1[.]1[.]1"
        val actual = LeetCode1108().defangIPaddr(address = "1.1.1.1")
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun leetCode1108_Ex2_isCorrect() {
        val expected = "255[.]100[.]50[.]0"
        val actual = LeetCode1108().defangIPaddr(address = "255.100.50.0")
        Assert.assertEquals(expected, actual)
    }
}