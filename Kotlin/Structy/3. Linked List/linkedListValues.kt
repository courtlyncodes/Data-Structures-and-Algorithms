class Node(val value: Any) {
    var next: Node? = null
}

// Write a function, linkedListValues, that takes in the head of a linked list as an argument. 
// The function should return an array containing all values of the nodes in the linked list.


fun linkedListValues(head: Node?): List<Any> {
   var list = mutableListOf<Any>()
   
   var current = head
   
   while(current != null) {
       list.add(current!!.value)
       current = current.next
   }
   return list
}

 fun main() {
   // First test: a -> b -> c -> d
   val a = Node("a")
   val b = Node("b")
   val c = Node("c")
   val d = Node("d")
   a.next = b
   b.next = c
   c.next = d

   val result1 = linkedListValues(a)
   println("Test 1 Result: $result1") // Should print: [a, b, c, d]

   // Second test: x -> y
   val x = Node("x")
   val y = Node("y")
   x.next = y

   val result2 = linkedListValues(x)
   println("Test 2 Result: $result2")
   
   // Third test: q
   val q = Node("q")
   q.next = null
   val result3 = linkedListValues(q)
   println("Test 3 Result: $result3")
   
   // Fourth test: null
   val result4 = linkedListValues(null)
   println("Test 4 Result: $result4")
}
