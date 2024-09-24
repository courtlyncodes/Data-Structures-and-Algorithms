class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        var setA = nums1.toHashSet()
        var setB = nums2.toHashSet()

        return setA.intersect(setB).toIntArray()
    }    
}