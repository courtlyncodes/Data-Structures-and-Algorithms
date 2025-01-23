class Node(val value: Any) {
    var next: Node? = null
}

// Remove the tail
fun popBack(head: Node?): Node? {
   if(head == null) return null
   if(head.next == null) return null
    
    var curr = head
    
    while(curr?.next.next != null) {
        curr = curr.next
    }
    
    curr?.next = null
    
    return head
}
