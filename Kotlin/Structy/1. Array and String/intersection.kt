// Leetcode 349

fun intersection(a: IntArray, b: IntArray): IntArray {
    // loop through first array
    	// loop through second array
    		// if items from first array match item from second array push first array item into new list
    // convert list into IntArray and return
    
    val setB = b.toSet()
    var matches = mutableListOf<Int>()
    
    for (n in a) {
        if (setB.contains(n)) {
                matches.add(n)
            }
        }

    return matches.toIntArray()
    
}


fun main() {
    println(intersection(intArrayOf(4, 2, 1, 6), intArrayOf(3, 6, 9, 2, 10)).contentToString())
    println(intersection(intArrayOf(2, 4, 6), intArrayOf(4, 2)).contentToString())
    println(intersection(intArrayOf(4, 2, 1), intArrayOf(1, 2, 4, 6)).contentToString())
    println(intersection(intArrayOf(0, 1, 2), intArrayOf(10, 11)).contentToString())
}