// Write a function that returns the total number of nodes in a binary tree.

class Node(val value: Any) {
    var left: Node? = null
    var right: Node? = null
}

fun countNodes(root: Node?): Int {
    if (root == null) return 0

    return 1 + countNodes(root.right) + countNodes(root.left)
}