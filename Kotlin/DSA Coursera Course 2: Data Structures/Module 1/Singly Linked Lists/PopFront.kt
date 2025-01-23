class Node(val value: Any) {
    var next: Node? = null
}

// Remove the first node
fun popFront(head: Node?): Node? {
    if(head == null) return null
    
    head = head.next
    
    return head
}
