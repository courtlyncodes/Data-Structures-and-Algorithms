class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var set = HashSet<Int>()

        for(n in nums) {
            if(!set.contains(n)){
                set.add(n)
            } else {
                return true
            }
        }
        
        return false
    }
}