class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        if (nums.size == 1) return nums[0].toDouble() / k
        var sum = 0
        var max: Double

        for (i in 0 until k) {
            sum += nums[i]
        }
        max = sum.toDouble() / k

        for (i in k until nums.size) {
            sum = sum - nums[i-k] + nums[i]
            if (sum.toDouble() / k > max) {
            max = sum.toDouble() / k
        }
        }
        return String.format("%.5f", max).toDouble()
    }
}