// Check if Any Subarray of Size K is Even-Sum
// Return true if there exists a subarray of size k with an even sum.

fun evenSumSubarray(nums: IntArray, k: Int): Boolean {
	var sum = 0
    
    for (i in 0 until k) {
        sum += nums[i]
    }
    
    if (sum % 2 == 0) {
        return true
    } else {
		for (i in k until nums.size) {
            sum = sum - nums[i-k] + nums[i]
            if (sum % 2 == 0) return true
        }
    }
    return false

}


fun main() {
    val nums = intArrayOf(1,2,5,8,3,6)
    val k = 2
    println(evenSumSubarray(nums, k))
    val nums2 = intArrayOf(1,2,3,4,5,6)
    val k2 = 3
    println(evenSumSubarray(nums2, k2))
}