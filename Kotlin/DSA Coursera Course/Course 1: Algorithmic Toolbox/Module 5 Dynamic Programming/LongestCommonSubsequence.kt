// Longest Common Subsequence of Two Sequences Problem
// Compute the maximum length of a common subsequence of two sequences.
// Input: Two sequences.
// Output: The maximum length of a common subsequence.
var cache = mutableMapOf<Pair<IntArray, IntArray>, Int>()

fun longestCommonSubsequence(list1: IntArray, list2: IntArray): Int {
    if(list1.isEmpty() || list2.isEmpty()) return 0
    if(list1.contentEquals(list2)) return list1.size
    
    if(cache.contains(Pair(list1, list2))) {
        return cache[Pair(list1, list2)]!!
    }
    
    if(list1.last() == list2.last()) {
        var result = longestCommonSubsequence(list1.dropLast(1).toIntArray(), list2.dropLast(1).toIntArray()) + 1
        cache[Pair(list1.dropLast(1).toIntArray(), list2.dropLast(1).toIntArray())] = result
        return result
    }
    
    var check1 = longestCommonSubsequence(list1.dropLast(1).toIntArray(), list2)
    var check2 = longestCommonSubsequence(list1, list2.dropLast(1).toIntArray())
    
    var result = maxOf(check1, check2)
    cache[Pair(list1, list2)] = result
    
    return result!!
    
}

fun main() {
    var list1 = intArrayOf(7, 2, 9, 3, 1, 5, 9, 4)
    var list2 = intArrayOf(2, 8, 1, 3, 9, 7)
    println(longestCommonSubsequence(list1, list2)) // Expected output: 3
    
    var list3 = intArrayOf(2, 7, 5)
    var list4 = intArrayOf(2, 5)
     println(longestCommonSubsequence(list3, list4)) // Expected output: 2
    
}