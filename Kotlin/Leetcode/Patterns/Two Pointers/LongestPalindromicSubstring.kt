class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""

        var start = 0
        var end = 0

        for (i in s.indices) {
            var left = i 
            var right = i

            while (left >= 0 && right < s.length && s[left] == s[right]) {
                if (right - left > end - start) {
                    start = left
                    end = right
                }
                left--
                right++
            }

            left = i
            right = i + 1
             while (left >= 0 && right < s.length && s[left] == s[right]) {
                if (right - left > end - start) {
                    start = left
                    end = right
                }
                left--
                right++
            }
        }
        return s.substring(start, end + 1)
    }
}