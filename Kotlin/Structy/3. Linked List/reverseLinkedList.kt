// Write a function, reverseList, that takes in the head of a linked list as an argument. 
// The function should reverse the order of the nodes in the linked list in-place and return the new head of the reversed linked list.

class Node(val value: Any) {
    var next: Node? = null
    
     override fun toString(): String {
        val result = StringBuilder()
        var current: Node? = this
        while (current != null) {
            result.append("${current.value}")
            if (current.next != null) {
                result.append(" -> ")
            }
            current = current.next
        }
        return result.toString()
    }
}



fun reverseList(head: Node?): Node? {
    if(head == null) {
        return head
    }
    
    var current = head
    var previous: Node? = null
    
    while(current != null) {
        val next = current.next
        
        current.next = previous
        previous = current
        current = next
    }
    return previous
}

fun main() {
    // First test
    val a = Node("a")
    val b = Node("b")
    val c = Node("c")
    val d = Node("d")
    val e = Node("e")
    val f = Node("f")
	// a -> b -> c -> d -> e -> f
    
    a.next = b
    b.next = c
    c.next = d
    d.next = e
    e.next = f

    println(reverseList(a)).toString() // f -> e -> d -> c -> b -> a

    // Second test
    val x = Node("x")
    val y = Node("y")

    x.next = y

    println(reverseList(x)) // y -> x

    // Third test
    val p = Node("p")

    println(reverseList(p))

}