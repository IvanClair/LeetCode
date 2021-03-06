package personal.ivan.leetcodepractice.easy

class LeetCode367 {

    /**
     * 367. Valid Perfect Square
     *
     * Given a positive integer num, write a function
     * which returns True if num is a perfect square else False.
     * Note: Do not use any built-in library function such as sqrt.
     *
     *
     * Example 1:
     * Input: 16
     * Output: true
     *
     *
     * Example 2:
     * Input: 14
     * Output: false
     */
    fun isPerfectSquare(num: Int): Boolean {
        for (i in 1..(num / 2 + 1)) {
            if (i * i == num) return true
        }
        return false
    }
}