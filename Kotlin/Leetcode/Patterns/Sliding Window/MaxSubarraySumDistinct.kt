// You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

// The length of the subarray is k, and
// All the elements of the subarray are distinct.
// Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

// A subarray is a contiguous non-empty sequence of elements within an array.


class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        // if the array is less than the length of the given window there is no max sum
        if (nums.size < k) return 0

        var set = HashSet<Int>()
        var sum = 0L
        var max = 0L
        // keep track of left pointer in window
        var left = 0

        for (right in nums.indices) {
            while (set.contains(nums[right])) {
                set.remove(nums[left])
                sum -= nums[left]
                left++
            }

            set.add(nums[right])
            sum += nums[right]

            if (right - left + 1 == k) {
                max = maxOf(max, sum)
                sum -= nums[left]
                set.remove(nums[left])
                left++
            }
        }
        return max
    }
}