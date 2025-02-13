// Find the Average of Each Subarray of Size K
// Compute the average of all contiguous subarrays of size k.

// Input: nums = [1, 2, 3, 4, 5], k = 3  
// Output: [2.0, 3.0, 4.0]  
// Explanation: Subarrays → [1,2,3], [2,3,4], [3,4,5] → Averages: [2.0, 3.0, 4.0].  

fun subarrayAverage(nums: IntArray, k: Int): DoubleArray {
    var sum = 0
    var result = DoubleArray(nums.size - k + 1)
    
	for (i in 0 until k) {
        sum += nums[i]
    }
    result[0] = sum.toDouble() / k
    
    for (i in k until nums.size) {
        sum = sum - nums[i - k] + nums[i]
        result[i - k + 1] = sum.toDouble() / k
    }
    return result
}


fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5)
val k = 3
val result = subarrayAverage(nums, k)

// Expected Output: [2.0, 3.0, 4.0]
println(result.joinToString(", "))
}