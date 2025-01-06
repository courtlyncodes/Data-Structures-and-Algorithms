class Node(val value: Any) {
    var left: Node? = null
    var right: Node? = null
}

fun main() {
    var a = new Node('a')
    var b = new Node('b')
    var c = new Node('c')
    var d = new Node('d')
    var e = new Node('e')
    var f = new Node('f')

    a.left = b 
    a.right = c
    b.left = d
    b.right = e 
    c.left = f                                

}