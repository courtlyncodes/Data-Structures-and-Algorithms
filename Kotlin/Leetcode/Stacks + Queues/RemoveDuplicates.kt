class Solution {
    fun removeDuplicates(s: String): String {
        var stack = ArrayDeque<Char>()

    for(char in s){
         if(stack.isEmpty() || stack.last() != char) {
            stack.add(char)
        } else if(!stack.isEmpty() && stack.last() == char) {
            stack.removeLast()
            }
        }
        return stack.joinToString("")
    }
}