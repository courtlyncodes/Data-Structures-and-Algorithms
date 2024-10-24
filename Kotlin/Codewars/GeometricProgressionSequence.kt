fun geometricSequenceElements(a: Int, r: Int, n: Int): String {
    var list = mutableListOf(a)
    var current = a
    
    while(list.size < n) {
        current = current * r
        list.add(current)
    }
    return list.joinToString()
}
