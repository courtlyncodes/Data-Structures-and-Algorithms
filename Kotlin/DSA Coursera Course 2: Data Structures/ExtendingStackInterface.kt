class Stack() {
    var stack = ArrayDeque<Any>()
    
    fun push(key: Any) {
        stack.add(key)
    }

    fun pop() {
       return if (stack.isNotEmpty()) stack.removeLast() else null
    }

    fun max() {
        return stack.maxOrNull()
    }
}