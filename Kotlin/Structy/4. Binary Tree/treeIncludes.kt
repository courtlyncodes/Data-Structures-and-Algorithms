// Write a function, treeIncludes, that takes in the root of a binary tree and a target value. 
// The function should return a boolean indicating whether or not the value is contained in the tree.

class Node(val value: Any) {
    var left: Node? = null
    var right: Node? = null
}

fun treeIncludes(root: Node?, target: Any): Boolean {
    if (root == null) return false
    
    var stack = ArrayDeque<Node>()
    stack.add(root)
    
    while(stack.isNotEmpty()) {
        var curr = stack.removeLast()
        
        if(curr.value == target) return true
          
        curr.right?.let { stack.add(it) }
        curr.left?.let { stack.add(it) }
    }
    return false
}

// Recursively
// Write a function, treeIncludes, that takes in the root of a binary tree and a target value. 
// The function should return a boolean indicating whether or not the value is contained in the tree.

fun treeIncludes(root: Node?, target: Any): Boolean {
  if (root.value == target) return true
  if (root == null) return false

  return treeIncludes(root.right, target) || treeIncludes(root.left, target)
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
    
    println(treeIncludes(a, 'e'))
    
    // Test 2   
    println(treeIncludes(a, 'a'))
    
    // Test 3
  	println(treeIncludes(a, 'n'))
    
    // Test 4
  	println(treeIncludes(a, 'f'))
    
    // Test 5
  	println(treeIncludes(a, 'p'))
    
    // Test 6
  	println(treeIncludes(null, 'b'))
    
}