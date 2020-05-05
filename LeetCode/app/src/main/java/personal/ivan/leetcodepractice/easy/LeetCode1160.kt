package personal.ivan.leetcodepractice.easy

class LeetCode1160 {

    /**
     * 1160. Find Words That Can Be Formed by Characters
     *
     * You are given an array of strings words and a string chars.
     * A string is good if it can be formed by characters from chars (each character can only be used once).
     * Return the sum of lengths of all good strings in words.
     *
     *
     * Example 1:
     * Input: words = ["cat","bt","hat","tree"], chars = "atach"
     * Output: 6
     * Explanation:
     * The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
     *
     *
     * Example 2:
     * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
     * Output: 10
     * Explanation:
     * The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
     *
     *
     * Note:
     * 1 <= words.length <= 1000
     * 1 <= words[i].length, chars.length <= 100
     * All strings contain lowercase English letters only.
     */
    fun countCharacters(
        words: Array<String>,
        chars: String
    ): Int {
        fun getAlphabetCount(target: String) =
            IntArray(26).apply { target.forEach { this[it - 'a']++ } }

        fun contains(
            charsAlphabetArray: IntArray,
            wordsAlphabetArray: IntArray
        ): Boolean {
            charsAlphabetArray.forEachIndexed { index, i ->
                if (i < wordsAlphabetArray[index]) {
                    return false
                }
            }
            return true
        }

        val alphabetOfCharsArray = getAlphabetCount(target = chars)
        var result = 0
        words.forEach {
            val alphabetOfWordsArray = getAlphabetCount(target = it)
            if (contains(
                    charsAlphabetArray = alphabetOfCharsArray,
                    wordsAlphabetArray = alphabetOfWordsArray
                )
            ) {
                result += it.length
            }
        }
        return result
    }
}