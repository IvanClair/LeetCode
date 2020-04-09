package personal.ivan.leetcodepractice.easy

import kotlin.math.min

class LeetCode892 {

    /**
     * 892. Surface Area of 3D Shapes
     *
     * On a N * N grid, we place some 1 * 1 * 1 cubes.
     * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
     * Return the total surface area of the resulting shapes.
     *
     *
     * Example 1:
     * Input: [[2]]
     * Output: 10
     *
     *
     * Example 2:
     * Input: [[1,2],[3,4]]
     * Output: 34
     *
     *
     * Example 3:
     * Input: [[1,0],[0,2]]
     * Output: 16
     *
     *
     * Example 4:
     * Input: [[1,1,1],[1,0,1],[1,1,1]]
     * Output: 32
     *
     *
     * Example 5:
     * Input: [[2,2,2],[2,1,2],[2,2,2]]
     * Output: 46
     *
     *
     * Note:
     * 1 <= N <= 50
     * 0 <= grid[i][j] <= 50
     */
    fun surfaceArea(grid: Array<IntArray>): Int {
        var blocks = 0
        var cover = 0
        repeat(grid.size) { i ->
            repeat(grid[i].size) { j ->
                // a block
                blocks += grid[i][j]
                // covers
                cover += if (grid[i][j] > 1) grid[i][j] - 1 else 0
                if (i > 0) {
                    cover += min(grid[i - 1][j], grid[i][j])
                }
                if (j > 0) {
                    cover += min(grid[i][j - 1], grid[i][j])
                }
            }
        }
        return blocks * 6 - cover * 2
    }
}