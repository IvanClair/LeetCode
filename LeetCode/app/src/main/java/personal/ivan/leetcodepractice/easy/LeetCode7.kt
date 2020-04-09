package personal.ivan.leetcodepractice.easy

class LeetCode7 {

    /**
     * 7. Reverse Integer
     *
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * Example 1:
     * Input: 123
     * Output: 321
     *
     *
     * Example 2:
     * Input: -123
     * Output: -321
     *
     *
     * Example 3:
     * Input: 120
     * Output: 21
     */
    fun reverse(x: Int): Int {
        var result = 0
        var copy = x
        while (copy != 0) {
            val temp = copy % 10
            copy /= 10

            if (result > Integer.MAX_VALUE / 10
                || (result == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)) {
                result = 0
                return result

            } else if (result < Integer.MIN_VALUE / 10
                || (result == Integer.MIN_VALUE / 10 && temp < Integer.MIN_VALUE % 10)) {
                result = 0
                return result
            }

            result = result * 10 + temp
        }
        return result
    }
}