// Used selection sort
class Solution {
    fun sortColors(nums: IntArray): IntArray {
        for (n in nums.indices) {
            var minIndex = n

            for (i in n + 1 until nums.size) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i
                }
            }
            var swap = nums[n]
            nums[n] = nums[minIndex]
            nums[minIndex] = swap
        }
        return nums
    }
}