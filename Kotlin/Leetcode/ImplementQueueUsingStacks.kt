//9.9
class MyQueue() {

    private var popping = ArrayDeque<Int>()
    private var pushing = ArrayDeque<Int>()

    fun push(x: Int) {
        pushing.add(x)
    }

    fun pop(): Int {
        if(popping.isEmpty()) {
            while(pushing.isNotEmpty()) {
                popping.add(pushing.removeLast())
            }
        }
        return popping.removeLast()
    }

    fun peek(): Int {
         if(popping.isEmpty() ) {
            while(pushing.isNotEmpty()) {
                popping.add(pushing.removeLast())
            }
        }
        return popping.last()
    }

    fun empty(): Boolean = if(popping.isEmpty() && pushing.isEmpty()) true else false
}
