// Write a function, treeSum, that takes in the root of a binary tree that contains number values. 
// The function should return the total sum of all values in the tree.

class Node(val value: Long) {
    var left: Node? = null
    var right: Node? = null
}

fun treeSum(root: Node?): Long {
    if (root == null) return 0
    
    var sum: Long  = root.value
    var stack = ArrayDeque<Node>()
    
    stack.add(root)
    
    while(stack.isNotEmpty()) {
        var curr = stack.removeLast()
        
        curr.right?.let { 
            stack.add(it)
            sum += it.value
        }
        
        curr.left?.let {
            stack.add(it)
            sum += it.value
        } 
    }
    return sum
}