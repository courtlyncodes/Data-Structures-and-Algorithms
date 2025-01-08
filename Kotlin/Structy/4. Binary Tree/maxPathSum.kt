// Write a function, maxPathSum, that takes in the root of a binary tree that contains number values. 
// The function should return the maximum sum of any root to leaf path within the tree.

// You may assume that the input tree is non-empty.

import kotlin.math.*

class Node(val value: Int) {
    var left: Node? = null
    var right: Node? = null
}

fun maxPathSum(root: Node?): Int {    
  if(root === null) return Int.MIN_VALUE
  if(root.left === null && root.right === null) {
   return root.value
  } 
    var maxChild = maxOf (
      maxPathSum(root.left),
  	  maxPathSum(root.right)
  )
  return root.value + maxChild
  
}



fun main() {
    // Test 1
    val a1 = Node(3)
    val b1 = Node(11)
    val c1 = Node(4)
    val d1 = Node(4)
    val e1 = Node(-2)
    val f1 = Node(1)

    a1.left = b1
    a1.right = c1
    b1.left = d1
    b1.right = e1
    c1.left = f1

    println("Test 1 Min Value: ${maxPathSum(a1)}") // Expected output: 18

    // Test 2
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

    println("Test 2 Min Value: ${maxPathSum(a2)}") // Expected output: 59
    
    // Test case 3 
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
    
    println("Test 3 Min Value: ${maxPathSum(a3)}") // Expected output: -8
    
   	// Test case 4
    val a4 = Node(42)
    
    println("Test 4 Min Value: ${maxPathSum(a4)}") // Expected output: 42
}
 