class TreeNode(val data: Any?) {
    val children: MutableList<TreeNode> = mutableListOf()

    fun addChild(child: Any?){
        if(child is TreeNode){
            children.add(child)
        } else {
            children.add(TreeNode(child))
        }
    }

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
            prinln(current.data)
            queue.addAll(current.children)
        }
    }

    override fun toString(): String {
        return "TreeNode(data=$data, children=$children)"
    }
}