class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
   	
    while(right >= left) {
        var mid = floor((right + left) / 2.0).toInt()
        
        if(target == nums[mid]) {
            return mid 
        } else if(target > nums[mid]) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
        return -1
    }
}