// Write a function that returns the number of leaf nodes in a binary tree (nodes with no children).

class Node(val value: Any) {
    var left: Node? = null
    var right: Node? = null
}

fun leafCount(root: Node?): Int {
    if(root == null) return 0 // if emtpy tree nodes are 0
    if(root.right == null && root.left == null) return 1
   
    return leafCount(root.right) + leafCount(root.left)
}
 

fun main() {
 
  
   val a2 = Node(5)
    val b2 = Node(11)
    val c2 = Node(54)
    val d2 = Node(20)
    val e2 = Node(15)
    val f2 = Node(1)
    val g2 = Node(3)

    a2.left = b2
    a2.right = c2
    b2.left = d2
    b2.right = e2
    e2.left = f2
    e2.right = g2
    // [5, 11, 54, 20, 15, null, null, 1, 3, null, null, null, null]
    
//     			5
//     		    /\
//     		  11 54 
//            /\  
//          20 15 
//     	        /\
//             1 3  
    	
    println(leafCount(a2))
    
    val a3 = Node(-1)
    val b3 = Node(-6)
    val c3 = Node(-5)
    val d3 = Node(-3)
    val e3 = Node(0)
    val f3 = Node(-13)
    val g3 = Node(-1)
    val h3 = Node(-2)

    a3.left = b3
    a3.right = c3
    b3.left = d3
    b3.right = e3
    c3.right = f3
    e3.left = g3
    f3.right = h3
    
    println(leafCount(a3))

}