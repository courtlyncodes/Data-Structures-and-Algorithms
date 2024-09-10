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

//9.10
class MyQueue() {

    private var pushing = ArrayDeque<Int>()
    private var popping = ArrayDeque<Int>()

    fun push(x: Int) {
        pushing.add(x)
    }

    fun pop(): Int {
        transfer()
        return popping.removeLast()
    }

    fun peek(): Int {
        transfer()
        return popping.last()
    }

    fun empty(): Boolean = popping.isEmpty() && pushing.isEmpty()

    private fun transfer() {
              if(popping.isEmpty()){
            while(pushing.isNotEmpty()){
                popping.add(pushing.removeLast())
            }
        }
    }
}

