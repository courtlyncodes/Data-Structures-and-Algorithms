class Node(val value: Any) {
    var next: Node? = null
}

// Push a new node to the front
fun pushFront(head: Node, key: Node?): Node {
    // Create a new node with the given key
	var new = Node(key)
    // Set the new node's next to head
    new.next = head
    
    // Return the new node as the head
    return head
}