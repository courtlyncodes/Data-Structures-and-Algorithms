class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var area = 0
        
        while (left < right) {
          val currentArea = minOf(height[left], height[right]) * (right - left) 
            area = maxOf(area, currentArea)  

            if (height[left] > height[right]) {
                right--
                continue
            }  else {
                left++
                continue
            }
        }
        return area
    }
}