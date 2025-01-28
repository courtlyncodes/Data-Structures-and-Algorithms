class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val store = ArrayDeque<Int>()
        var start = 0
        val result = IntArray(nums.size - k + 1)
        for (end in nums.indices) {
            while (store.isNotEmpty() && nums[store.last()] < nums[end]) {
                store.removeLast()
            }
            store.addLast(end)
            if (end - start == k - 1) {
                result[start] = nums[store.first()]
                if (nums[store.first()] == nums[start]) {
                        store.removeFirst()
                }
                start++
            }
        }
        return result
    }
}