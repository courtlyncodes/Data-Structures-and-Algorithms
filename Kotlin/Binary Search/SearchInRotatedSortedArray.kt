class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while(right >= left) {
            var mid = (right + left) / 2
            if(target == nums[mid]) return mid
            //if the left side is sorted 
            if(nums[left] <= nums[mid]) {
                // if target is in between left and middle
                if(target >= nums[left] && target < nums[mid]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
                // if the right side is sorted
            } else {
                // if target is between mid and right
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return -1
    }
}