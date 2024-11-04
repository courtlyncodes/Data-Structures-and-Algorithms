var stack = ArrayDeque<Char>()

for(char in s) {
    if(stack.isEmpty() || stack.last().isLowerCase() && stack.last().toChar() != char.lowercase()) {