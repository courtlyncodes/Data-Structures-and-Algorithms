class Node(val value: Int) {
    var next: Node? = null
}

// Write a function, sumList, that takes in the head of a linked list containing numbers as an argument. 
// The function should return the total sum of all values in the linked list.


fun sumList(head: Node?): Int {
   var sum = 0
      var current = head
   
   while(current != null) {
       sum += current.value
       current = current.next
   }
  return sum
}

 fun main() {
   // First test
     val a = Node(2);
   val b = Node(8);
   val c = Node(3);
   val d = Node(-1);
   val e = Node(7);

   a.next = b;
   b.next = c;
   c.next = d;
   d.next = e;

   val result1 = sumList(a)
   println("Test 1 Result: $result1") 

   // Second test: x -> y
      val x = Node(38);
      val y = Node(4);

      x.next = y;

   val result2 = sumList(x)
   println("Test 2 Result: $result2")
   
   // Third test: z
   val z = Node(100);
   z.next = null
   val result3 = sumList(z)
   println("Test 3 Result: $result3")
   
   // Fourth test: null
   val result4 = sumList(null)
   println("Test 4 Result: $result4")
}
