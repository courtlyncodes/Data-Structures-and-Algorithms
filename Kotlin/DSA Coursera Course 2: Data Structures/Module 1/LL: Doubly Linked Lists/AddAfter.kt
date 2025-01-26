// Doubly-linked list
class Node(val value: Any) {
    var prev: Node? = null
    var next: Node? = null
}

// Add after a specific target
fun addAfter(head: Node?, target: Node?, key: Any): Node? {
	if (head == null || target == null) return head
    
    var newNode = Node(key)
    var curr = head 
   
    while(curr != null && curr != target) {
        curr = curr.next
    }
   
   if(curr == target) {
       var next = curr.next
       curr.next = newNode
       newNode.next = next
       next?.prev = newNode
       newNode.prev = curr
   }
    return head
}
