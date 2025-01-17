class Solution {
    
    var cache = mutableMapOf<Pair<String,String>, Int>()
    
    fun minDistance(word1: String, word2: String): Int {
        if(word1.isEmpty()) return word2.length
        if(word2.isEmpty()) return word1.length

        if(cache.contains(Pair(word1, word2))) {
            return cache[Pair(word1, word2)]!!
        } 

        if(word1.last() == word2.last()) {
            var result = minDistance(word1.dropLast(1), word2.dropLast(1))
            cache[Pair(word1, word2)] = result
            return result
        }

        var insert = minDistance(word1, word2.dropLast(1)) + 1
        var delete = minDistance(word1.dropLast(1), word2) + 1
        var substitute = minDistance(word1.dropLast(1), word2.dropLast(1)) + 1
        
        var result = minOf(minOf(insert, delete), substitute)
        cache[Pair(word1, word2)] = result

        return result
    }
}