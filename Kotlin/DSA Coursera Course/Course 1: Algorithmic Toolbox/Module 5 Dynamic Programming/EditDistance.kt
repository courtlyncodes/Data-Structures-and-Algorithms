// Edit Distance Problem
// Compute the edit distance between two strings.
// Input: Two strings.
// Output: The minimum number of single-symbol insertions, deletions, and substitutions to transform one string into the other.

val cache = mutableMapOf<Pair<String, String>, Int>()

fun editDistance(s1: String, s2: String): Int {
    // Base cases
    if (s1.isEmpty()) return s2.length
    if (s2.isEmpty()) return s1.length
    
    // Check if the result is already computed
    if (cache.contains(Pair(s1, s2))) {
        return cache[Pair(s1, s2)]!!
    }

    // If the characters match, no operation is needed
    if (s1.last() == s2.last()) {
        val result = editDistance(s1.dropLast(1), s2.dropLast(1))
        cache[Pair(s1, s2)] = result
        return result
    }

    // Calculate the cost for insertion, deletion, and substitution
    val insertion = editDistance(s1, s2.dropLast(1)) + 1
    val deletion = editDistance(s1.dropLast(1), s2) + 1
    val substitution = editDistance(s1.dropLast(1), s2.dropLast(1)) + 1

    // Get the minimum cost and store it in the cache
    val result = minOf(minOf(insertion, deletion), substitution)
    cache[Pair(s1, s2)] = result
    return result
}

fun main() {
    println(editDistance("horse", "ros")) // Expected output: 3
}