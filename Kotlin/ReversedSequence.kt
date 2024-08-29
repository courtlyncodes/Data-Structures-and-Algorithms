//first 
fun reverseSeq(n: Int): List<Int> {
    val list = mutableListOf<Int>()
    
    for(i in n downTo 1) {
        list.add(i)
    }
    return list
}

//optimized
fun reverseSeq(n: Int): List<Int> = (n downTo 1).toList()