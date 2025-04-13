//  Find the Maximum Sum of a Subarray of Size K
// Given an array, find the maximum sum of any contiguous subarray of size k.

fun maxSubarraySum(nums: IntArray, k: Int): Int {
    var sum = 0
    var max = Int.MIN_VALUE
    
    for (i in 0 until k) {
        sum += nums[i]
    }
    if (sum > max) {
        max = sum
    }
    
    for (i in k until nums.size) {
        sum = sum - nums[i - k] + nums[i]
        if (sum > max) max = sum
    }
    return max
}

fun main() {
    var nums = intArrayOf(1,2,3,4,5,6)
    var k = 3
    println(maxSubarraySum(nums, k))
    
}