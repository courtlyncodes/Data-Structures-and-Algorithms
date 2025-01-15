class Solution {
    var cache = hashMapOf<Int, Int>()

    fun climbStairs(n: Int): Int {
        if(n == 1) return 1
        if(n == 2) return 2

        if(cache.isEmpty()) {
            cache[1] = 1
            cache[2] = 2
        }
         
        if(cache.contains(n)) return cache[n]!!

        cache[n] = climbStairs(n - 1) + climbStairs(n - 2)

        return cache[n]!!        
    }
}