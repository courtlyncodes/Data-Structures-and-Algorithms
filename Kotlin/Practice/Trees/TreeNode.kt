// write this class as a binary tree
// remove add child
// use left and right "variables" in script to
class TreeNode(val data: Any?) {
    // val children: MutableList<TreeNode> = mutableListOf()

    // add data not child
    // make child a string...can later use generics
    // what would this look like with a binary tree?
    // linked lists!
    // left & right, no list
    fun addChild(child: String){
        // if(child is TreeNode){
        //     children.add(child)
        // } else {

    
            children.add(TreeNode(child))
        }
    // }

    // another child method to add to children
    1
    -5
    --2
    --7
    -2
    --1
    --6

    []
    


    // remove data not child
    // change to string
    fun removeChild(childToRemove: Any) {
        val length = children.length
        children = children.filter {
            if (childToRemove is TreeNode) {
                childToRemove !== it
            } else {
                childToRemove !== it.data
            }
        }
        if (length == children.size) {
            children.forEach {
                removeChild(it)
            }
        }
    }

    fun depthFirstTraversal() {
        println(data)
        children.forEach {
            it.depthFirstTraversal()
        }
    }

    fun breadthFirstTraversal() {
        var queue: MutableList<TreeNode> = mutableListOf()
        queue.add(this)
        while(queue.isNotEmpty()) {
            val current = queue.removeFirst()
            println(current.data)
            queue.addAll(current.children)
        }
    }

    override fun toString(): String {
        return "TreeNode(data=$data, children=$children)"
    }
}