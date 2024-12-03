class Node(val value: Any) {
    var next: Node? = null
}

// Write a function, getNodeValue, that takes in the head of a linked list and an index.
// The function should return the value of the linked list at the specified index.
// If there is no node at the given index, then return null.

fun getNodeValue(head: Node?, index: Int): Any? {
    var current = head
    var count = 0

    while (current != null) {
        if (count == index) {
            return current.value
        }
        current = current!!.next
        count++
    }
    return null
}

fun main() {
    // First test
    val a = Node("a")
    val b = Node("b")
    val c = Node("c")
    val d = Node("d")

    a.next = b
    b.next = c
    c.next = d

    println(getNodeValue(a, 2))

    // Second test
    val e = Node("a")
    val f = Node("b")
    val g = Node("c")
    val h = Node("d")

    e.next = b
    f.next = c
    g.next = d

    println(getNodeValue(a, 7))

    // Third test
    val node1 = Node("banana")
    var node2 = Node("mango")

    node1.next = node2

    println(getNodeValue(node1, 0))

    // Fourth test
    val node3 = Node("banana")
    var node4 = Node("mango")

    node3.next = node4

    println(getNodeValue(node3, 1))
}