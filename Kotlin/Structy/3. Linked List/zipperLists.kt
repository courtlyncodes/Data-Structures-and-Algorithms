class Node(val value: Any) {
    var next: Node? = null
}

// Write a function, zipperLists, that takes in the head of two linked lists as arguments. 
// The function should zipper the two lists together into single linked list by alternating nodes. 
// If one of the linked lists is longer than the other, the resulting list should terminate with the remaining nodes. 
// The function should return the head of the zippered linked list.

// Do this in-place, by mutating the original Nodes.

// You may assume that both input lists are non-empty.

fun zipperLists(head1: Node?, head2: Node?): Node? {
    
    if (head1 == null) return head2
    if (head2 == null) return head1
    
    var current1 = head1 // a -> b -> c
   	var current2 = head2 // x -> y -> z

    while (current1 != null && current2 != null) {
        var next1 = current1.next // c
        var next2 =	current2.next // z
        
        current1.next = current2 // a -> x -> b -> c -> y -> z
        current2.next = next1 
        
        current1 = next1 // b -> c
        current2 = next2 // y -> z
    }
    return current1
   
       
    
}

fun zipperLists(head1: Node?, head2: Node?): Node? {
    // If either head is null, return the other head
    if (head1 == null) return head2
    if (head2 == null) return head1

    var current1 = head1 // b -> c 
    var current2 = head2 // x -> y -> z 

    // Keep track of the merged list's head
    val mergedHead = current1 // a -> b -> c
    current1 = current1.next // b -> c

    var tail = mergedHead // a -> b -> c

    // Zipper the lists
    while (current1 != null && current2 != null) {
        val next1 = current1.next // c
        val next2 = current2.next // y z

        // Attach nodes alternately
        tail.next = current2 // a -> x -> y -> z
        tail = tail.next!! 
        tail.next = current1 // a -> x -> b -> c
        tail = tail.next!!

        current1 = next1 
        current2 = next2
    }

    // Attach the remaining nodes, if any
    if (current1 != null) {
        tail.next = current1
    } else if (current2 != null) {
        tail.next = current2
    }

    return mergedHead
}

// fun main() {
//     // First test
//     val a = Node("a")
//     val b = Node("b")
//     val c = Node("c")
//     val d = Node("d")

//     a.next = b
//     b.next = c
//     c.next = d

//     println(getNodeValue(a, 2))

//     // Second test
//     val e = Node("a")
//     val f = Node("b")
//     val g = Node("c")
//     val h = Node("d")

//     e.next = b
//     f.next = c
//     g.next = d

//     println(getNodeValue(a, 7))

//     // Third test
//     val node1 = Node("banana")
//     var node2 = Node("mango")

//     node1.next = node2

//     println(getNodeValue(node1, 0))

//     // Fourth test
//     val node3 = Node("banana")
//     var node4 = Node("mango")

//     node3.next = node4

//     println(getNodeValue(node3, 1))
// }