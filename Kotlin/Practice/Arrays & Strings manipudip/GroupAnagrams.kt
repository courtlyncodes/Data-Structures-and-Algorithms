class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
       val master = mutableMapOf<String, MutableList<String>>()

       for (str in strs) {
        val sorted = str.toCharArray().sorted().joinToString("")

        if (master.contains(sorted)) {
            master[sorted]!!.add(str)
        } else {
            master[sorted] = mutableListOf(str)
        }
       }
       return master.values.toList()
    }
}