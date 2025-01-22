// Given an integer array nums, find the subarray with the largest sum, and return its sum.



class Solution {
    fun maxSubArray(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]

        var maxSum = nums[0]
        var currSum = nums[0]

        for(n in 1 until nums.size) {
            currSum = maxOf(nums[n], currSum + nums[n])
            if(currSum > maxSum) {
                maxSum = currSum
            }
        }
        return maxSum
    }
}