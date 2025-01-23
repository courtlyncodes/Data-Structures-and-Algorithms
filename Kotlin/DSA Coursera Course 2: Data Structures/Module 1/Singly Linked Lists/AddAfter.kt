class Node(val value: Any) {
    var next: Node? = null
}

// Remove the tail
fun addAfter(head: Node?, target: Node?, key: Any?): Node? {
   if (head == null || target == null) return head
   
   var curr = head
   
   while(curr != null && curr != target) {
      curr = curr.next
   }
   
   if (curr == target) {
       var newNode = Node(key)
       var next = curr.next
       curr.next = newNode
       newNode.next = next
   }
   
   return head
}
