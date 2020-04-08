package personal.ivan.leetcodepractice.easy

class LeetCode1 {

    /**
     * 1. Two Sum
     *
     * Given an array of integers,
     * return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     *
     *
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val resultArray = IntArray(2)
        val map = mutableMapOf<Int, Int>()
        run here@{
            nums.forEachIndexed { index, value ->
                map[value]?.also {
                    resultArray[0] = it
                    resultArray[1] = index
                    return@here
                }
                map[target - value] = index
            }
        }
        return resultArray
    }
}