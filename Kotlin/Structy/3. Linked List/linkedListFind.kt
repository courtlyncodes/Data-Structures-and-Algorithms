class Node(val value: Any) {
    var next: Node? = null
}

// Write a function, linkedListFind, that takes in the head of a linked list and a target value. 
// The function should return a boolean indicating whether or not the linked list contains the target.

fun linkedListFind(head: Node?, target: Any): Boolean {
   var current = head
   
   while(current != null) {
       if(current.value == target) {
           return true
       }
       current = current.next
   }
   return false
}

 fun main() {
   // First test
     val a =  Node("a");
   val b = Node("b");
   val c = Node("c");
   val  d = Node("d");

   a.next = b;
   b.next = c;
   c.next = d;

   val result1 = linkedListFind(a, "c")
   println("Test 1 Result: $result1") 

  // Second test
      val node1 = Node("jason");
   val node2 = Node("leneli");

   node1.next = node2;

   println(linkedListFind(node1, "courtlyn"))
}
