// Combine and Deduplicate Lists


// Given two lists of integers, return a sorted list that contains only unique elements from both lists.
// Example: [1, 3, 5, 7] and [2, 3, 6, 7] → [1, 2, 3, 5, 6, 7]

// loop through list 1 and add to set,
// loop through list 2 and add to set
// return set as list?

fun combineAndDeduplicate(list1: List<Int>, list2: List<Int>): List<Int> {
    var hash = HashSet<Int>()
    
    hash.addAll(list1)
    hash.addAll(list2)
    
   return hash.toList().sorted()
    
}

fun main() {
    var list1 = listOf(1, 3, 5, 7)
    var list2 = listOf(2, 3, 9, 7)
    
    println(combineAndDeduplicate(list1, list2))
    
//     var list3 = listOf("apple", "banana", "apricot", "blueberry")
//     var list4 = listOf("apple", "banana", "strawberry", "grapes")
    
//     println(combineAndDeduplicate(list3, list4))
        
}