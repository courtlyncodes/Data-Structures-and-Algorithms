class Solution {
    fun clearDigits(s: String): String {
       var stack = ArrayDeque<Char>()
    
    for(char in s) {
        if(stack.isEmpty() || !char.isDigit()){
            stack.add(char)
        } else {
            stack.removeLast()
        }
    }
    return stack.joinToString("") 
    }
}