import kotlin.math.ceil

class Solution {
    fun isPalindrome(s: String): Boolean {
        var string = s.lowercase().replace(Regex("[^a-zA-Z0-9]"), "")
        if(string.length < 1) {
            return true
        } else {
            var firstHalf = string.substring(0, string.length / 2)
            var secondHalf = string.substring(ceil(string.length.toDouble() / 2).toInt(), string.length).reversed()
            return firstHalf == secondHalf
        }
        return false
    }
}