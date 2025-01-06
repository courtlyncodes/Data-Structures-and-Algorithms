// Write a function, breadthFirstValues, that takes in the root of a binary tree. 
// The function should return an array containing all values of the tree in breadth-first order.

class Node(val value: Char) {
    var left: Node? = null
    var right: Node? = null
}


fun main() {
    // Test 1
    val a = Node('a')
    val b = Node('b')
    val c = Node('c')
    val d = Node('d')
    val e = Node('e')
    val f = Node('f')

    a.left = b 
    a.right = c
    b.left = d
    b.right = e 
    c.left = f    
    
    println(breadthFirstValues(a))
    
    // Test 2
    println(breadthFirstValues(null))
    
    // Test 3
    val g = Node('g')
    val h = Node('h')
    val j = Node('j')
    
    g.left = h
    g.right = j
    
    println(breadthFirstValues(g))
    
  	// Test 4
    val k = Node('k')
    
    println(breadthFirstValues(k))

}