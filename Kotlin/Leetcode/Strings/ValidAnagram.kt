class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var mapOne = mutableMapOf<Char, Int>()
        var mapTwo = mutableMapOf<Char, Int>()

        for(char in s) {
            if(!mapOne.contains(char)) {
                mapOne.put(char, 1)
            } else {
                mapOne.put(char, mapOne.getValue(char) + 1)
            }
        }

        for(char in t) {
            if(!mapTwo.contains(char)) {
                mapTwo.put(char, 1)
            } else {
                mapTwo.put(char, mapTwo.getValue(char) + 1)
            }
        }

         for((k, v) in mapOne) {
            if(!mapTwo.contains(k) || mapTwo.getValue(k) != v || mapOne.size != mapTwo.size) {
                return false
            } 
         }
         return true
    }
}