class Solution {
    fun makeGood(s: String): String {
        val string = s
        var stack = ArrayDeque<Char>()

        for(char in string) {
            if(stack.isEmpty() || stack.last().isLowerCase() && char.isLowerCase() ) {
                stack.add(char)
            } else if(stack.last().isUpperCase() && char.isUpperCase()){ 
                stack.add(char)
            } else if(stack.last().isUpperCase() && char.isLowerCase() && stack.last().toString() == char.uppercase()) {
                stack.removeLast()
            } else if(stack.last().isLowerCase() && char.isUpperCase() && stack.last().toString() == char.lowercase()){
                stack.removeLast()
            } else {
                stack.add(char)
            }
    }
        return stack.joinToString("")
    }
}