class Node(val value: Any) {
    var next: Node? = null
}

// Set a new tail
fun pushBack(head: Node?, key: Node?): Node? {
    var newNode = Node(key)
    newNode.next = null
   
    // If the head is empty the head is the new node
    if(head == null) {
    	return newNode
    }
    
    var curr = head
    
    while(curr?.next != null) {
        curr = curr.next
    }
    curr?.next = newNode
    
    return head
}