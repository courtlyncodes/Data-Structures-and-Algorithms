class Solution {
    fun majorityElement(nums: IntArray): Int {
        var map = mutableMapOf<Int, Int>()
        var majorityNum = nums.size / 2

        for(num in nums) {
            if(!map.contains(num)) {
                map.put(num, 1)
            } else {
                map.set(num, map.getValue(num) + 1)
            }
        }
          return map.filterValues { it >= majorityNum + 1 }.keys.first()
    }
}