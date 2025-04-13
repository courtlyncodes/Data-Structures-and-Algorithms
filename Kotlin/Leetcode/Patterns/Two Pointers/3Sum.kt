class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var sorted = nums.sorted()
        var answer = mutableListOf<List<Int>>()

        for (n in sorted.indices) {
            if (n > 0 && sorted[n] == sorted[n-1]) continue
            var curr = sorted[n]
            var left = n + 1
            var right = sorted.size - 1

            while (left < right) {
                if (left > n + 1 && sorted[left] == sorted[left - 1]) {
                    left++
                    continue 
                }
                if (sorted[left] + sorted[right] > -curr) {
                    right--
                } else if (sorted[left] + sorted[right] < -curr) {
                    left++
                } else if (sorted[left] + sorted[right] == -curr) {
                    answer.add(mutableListOf(curr, sorted[left], sorted[right]))  
                    left++ 
                    right--
                    
                    if (left > 0 && sorted[left] == sorted[left - 1]) {
                        left++
                    } 
                }
            }
        }
        return answer
    }
}