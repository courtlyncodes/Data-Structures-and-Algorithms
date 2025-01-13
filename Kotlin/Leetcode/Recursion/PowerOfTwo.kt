//Leetcode

import kotlin.math.pow 

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if(n <= 0) {
            return false
        } 
        if(n == 1) {
            return true
        }
       return if(n % 2 == 0) {
            isPowerOfTwo(n / 2)
        } else {
            false
        }
    }
}
