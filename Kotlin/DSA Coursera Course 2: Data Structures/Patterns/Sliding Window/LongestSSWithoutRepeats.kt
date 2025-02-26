// Given a string s, find the length of the longest substring without duplicate characters.

 

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length == 0) return 0
        if (s.length == 1) return 1

        var set = HashSet<Char>()
        var maxLength = 0 
        var currLength = 0
        var left = 0

        for (right in s.indices) {
            while(set.contains(s[right])) {
                set.remove(s[left])
                left++
                currLength--
            }
            set.add(s[right])
            currLength++
            maxLength = maxOf(maxLength, currLength)
        }
        return maxLength
    }
}

