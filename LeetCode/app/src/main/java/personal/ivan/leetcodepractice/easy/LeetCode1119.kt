package personal.ivan.leetcodepractice.easy

class LeetCode1119 {

    /**
     * 1119. Remove Vowels from a String
     *
     * Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
     *
     * Example 1:
     * Input: "leetcodeisacommunityforcoders"
     * Output: "ltcdscmmntyfrcdrs"
     *
     *
     * Example 2:
     * Input: "aeiou"
     * Output: ""
     *
     *
     * Note:
     * S consists of lowercase English letters only.
     * 1 <= S.length <= 1000
     */
    fun removeVowels(input: String): String =
        input.replace(Regex("[aeiou]"), "")
}