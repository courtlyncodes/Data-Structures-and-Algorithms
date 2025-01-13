//8.28
class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = mutableMapOf<Char, Int>()

        for (i in magazine) {
            if (!map.containsKey(i)) {
                map.put(i, 1)
            } else {
                map.put(i, map.getValue(i) + 1)
            }
        }
        for (j in ransomNote) {
            if (map.containsKey(j) && map[j]!! > 0) {
                map.set(j, map[j]!! - 1)
            } else {
                return false
            }
        }
        return true
    }
}