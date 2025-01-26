// Doubly-linked list
class Node(val value: Any) {
    var prev: Node? = null
    var next: Node? = null
}

// Add to tail
fun pushBack(head: Node?, key: Any?): Node? {
    var newNode = Node(key)
    
    if (head == null) return newNode
    
    var curr = head
    
    while(curr?.next != null) {
        curr = curr.next
    }
    curr?.next = newNode
    newNode.prev = curr
}