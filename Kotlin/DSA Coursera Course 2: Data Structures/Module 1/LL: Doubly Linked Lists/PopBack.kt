// Doubly-linked list
class Node(val value: Any) {
    var prev: Node? = null
    var next: Node? = null
}

// Remove tail
fun popBack(head: Node?): Node? {
    if (head == null || head.next == null) return null 
    
    var curr = head
    
    while(curr?.next?.next != null) {
        curr = curr.next
    }
    
    curr.next = null
    
    return head
    
}