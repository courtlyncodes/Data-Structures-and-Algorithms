// Write a function, depthFirstValues, that takes in the root of a binary tree. 
// The function should return an array containing all values of the tree in depth-first order.

// Iterative approach
class Node(val value: Char) {
    var left: Node? = null
    var right: Node? = null
}

fun depthFirstValues(root: Node?): CharArray {
    var arr = mutableListOf<Char>()
    var stack = ArrayDeque<Node>()
   
    
    if(root == null) return arr.toCharArray()
    
    stack.add(root)
    
   while(stack.isNotEmpty()) {
   		var curr = stack.removeLast()
        arr.add(curr.value)
        
        curr.right?.let { stack.add(it) }
       	curr.left?.let { stack.add(it) } 
           
      
   }
    
    return arr.toCharArray()
        
}

// Recursively
fun depthFirstValues(root: Node?): List<Char> {
    val result = mutableListOf<Char>()
    if (root == null) return result 

    result.add(root.value)
    result.addAll(depthFirstValues(root.left))
    result.addAll(depthFirstValues(root.right))
    return result
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
    
    println(depthFirstValues(a))
    
    // Test 2
    println(depthFirstValues(null))
    
    // Test 3
    val g = Node('g')
    val h = Node('h')
    val j = Node('j')

    g.left = h
    g.right = j 
    
    println(depthFirstValues(g))
    
  	// Test 4
    val k = Node('k')
    
    println(depthFirstValues(k))

}