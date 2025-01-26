fun computeTreeHeight(n: Int, parent: IntArray): Int {
    // Build adjacency list

    val tree = MutableList(n) { mutableListOf<Int>() }
    var root = -1
    for (i in parent.indices) {
        if (parent[i] == -1) {
            root = i
        } else {
            tree[parent[i]].add(i)
        }
    }

    fun dfs(node: Int): Int {
        if (tree[node].isEmpty()) return 1
        var max = 0

        for (child in tree[node]) {
            max = maxOf(max, dfs(child))
        }

        return max + 1
    }

    return dfs(root)
}