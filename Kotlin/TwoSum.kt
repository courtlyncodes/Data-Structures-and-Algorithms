class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()
        val arr = arrayListOf<Int>()

        for (i in nums.indices) {
            hashMap[i] = nums[i]
        }

        for ((key, value) in hashMap) {
            val complement = target - value

            for ((k, v) in hashMap) {
                if (v === complement && k != key) {
                    arr.add(key)
                    arr.add(k)
                    return arr.toIntArray()
                }
            }
        }
        return arr.toIntArray()
    }
}