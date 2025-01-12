// Problem: Write a function that checks whether a binary tree is symmetric (i.e., its left and right subtrees are mirror images of each other).

class Node(val value: Any) {
    var right? = null
    var left? = null
}

fun symmetricTree(root: Node?): Boolean {
    if(root.right == null && root.left == null) return true
    if(root.right == root.left) return true

    invertTree(root.right)
    
    return isSameTree(root.right, root.left)
}

private fun invertTree(root: Node?): Node? {
    if(root == null) return root

    var right = root.right
    root.right = root.left
    root.left = right

    var left = invertTree(root.left)
    var right = invertTree(root.right)

    return root
}

private fun isSameTree(r: Node?, f: Node?): Boolean {
      if(r == null && f == null) return true
      if(r == null || f == null || r.value != f.value) return false
  
      return isSameTree(r?.left, f?.left) && isSameTree(r?.right, f?.right)
}

    //       1
    //     / \
    //   2     2
    //  / \    /\
    // 3   4   4  3
//     /\  /\  /\ /\
//    5 6 7 8 8 7 6 5
// Input: root = [1,2,2,3,4,4,3,5,6,7,8,8,7,6,5]

    //       1
    //     / \
    //   2     2
    //  / \    /\
    // 4   3   3  4
//     /\  /\  /\ /\
//    6 5 8 7 7 8 5 6