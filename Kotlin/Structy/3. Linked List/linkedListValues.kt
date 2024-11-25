class Node(val value: Int) {
    var next: Node? = null
}

// Write a function, linkedListValues, that takes in the head of a linked list as an argument. 
// The function should return an array containing all values of the nodes in the linked list.


fun linkedListValues(head: Node?): List<Int> {
   var list = mutableListOf<Int>()
   
   var current = head
   
   while(current != null) {
       list.add(current!!.value)
       current = current.next
   }
   return list
}

 fun main() {
   // Create linked list: 1 -> 2 -> 3 -> null
   val head = Node(1)
   head.next = Node(2)
   head.next?.next = Node(3)

   // Expected output
   val expected = listOf(1, 2, 3)

   // Run the function
   val result = linkedListValues(head)

   // Test the result
   if (result == expected) {
       println("Test passed!")
   } else {
       println("Test failed: Expected $expected but got $result")
   }
}