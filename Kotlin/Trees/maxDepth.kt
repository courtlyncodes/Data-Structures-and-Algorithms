// Given a binary tree, write a function that returns the maximum depth of the tree.

class Node(val value: Any) {
    var left: Node? = null
    var right: Node? = null
}

fun maxDepth(root: Node?): Int {
    if(root == null) return 0

    var rightDepth = maxDepth(root.right)
    var leftDepth = maxDepth(root.left)

    return 1 + maxOf(rightDepth, leftDepth)
}