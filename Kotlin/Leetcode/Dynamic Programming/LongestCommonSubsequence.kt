class Solution {
    var cache = hashMapOf<Pair<String, String>, Int>()

    fun longestCommonSubsequence(text1: String, text2: String): Int {
        if(text1.isEmpty() || text2.isEmpty()) return 0
        if(text1.contentEquals(text2)) return text1.length

        if(cache.containsKey(Pair(text1, text2))) {
            return cache[Pair(text1, text2)]!!
        }

        var result = 0
        if(text1.last() == text2.last()){
            result = longestCommonSubsequence(text1.dropLast(1), text2.dropLast(1)) + 1 
        } else {
            result = maxOf(
                longestCommonSubsequence(text1.dropLast(1), text2), 
                longestCommonSubsequence(text1, text2.dropLast(1))
            )
        }
        
        cache[Pair(text1, text2)] = result

        return result!!
        
    }
}