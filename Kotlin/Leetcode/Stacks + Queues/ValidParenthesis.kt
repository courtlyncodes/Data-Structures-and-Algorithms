//9.9

class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf( ')' to '(', '}' to '{', ']' to '[' )
        var stack = ArrayDeque<Char>()

        for(char in s) {
            if(map.containsValue(char)) {
                stack.add(char)
            } else if(stack.isEmpty() || stack.removeLast() != map.get(char)) {
                return false
            }
        }
        return stack.isEmpty()
    }   
}