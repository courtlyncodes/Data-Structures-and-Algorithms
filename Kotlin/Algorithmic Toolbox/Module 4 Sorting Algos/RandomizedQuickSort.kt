// Speeding-up RandomizedQuickSort Problem

// Sort a given sequence of numbers (that may contain duplicates) using a modification of RandomizedQuickSort that works in O(nlogn) expected time.
// Input: An integer array with  n elements that may contain duplicates.
// Output: Sorted array (generated using a modification of RandomizedQuickSort) that works in O(nlogn) expected time.

fun randomizedQuickSort(arr: IntArray): IntArray {
    // if c consists of a single element: return c
    if(arr.size <= 1) return arr
    // randomly select an element m from c
    var pivot = arr.random()
    
    var small = arr.filter { it < pivot }.toIntArray()
    var large = arr.filter { it > pivot }.toIntArray()
    
    var sortedSmall = randomizedQuickSort(small)
    var sortedLarge = randomizedQuickSort(large)
    
    return sortedSmall + arr.filter { it == pivot } + sortedLarge
    
    
}
    
    fun main() {
        val arr1 = intArrayOf(2,3,9,2,2)
        println(randomizedQuickSort(arr1).joinToString(", "))
        
        val arr2 = intArrayOf()
        println(randomizedQuickSort(arr2).joinToString(", "))
        
        val arr = intArrayOf(
        2, 3, 9, 2, 2, 7, 1, 5, 3, 6,
        3, 1, 8, 5, 2, 6, 4, 8, 7, 0,
        9, 6, 5, 2, 3, 4, 7, 8, 6, 1,
        0, 5, 9, 4, 7, 2, 8, 3, 1, 6,
        0, 5, 9, 4, 7, 2, 8, 3, 1, 6,
        0, 5, 9, 4, 7, 2, 8, 3, 1, 6,
        0, 5, 9, 4, 7, 2, 8, 3, 1, 6,
        0, 5, 9, 4, 7, 2, 8, 3, 1, 6,
        0, 5, 9, 4, 7, 2, 8, 3, 1, 6,
        0, 5, 9, 4, 7, 2, 8, 3, 1, 6
    )

    val sortedArr = randomizedQuickSort(arr)
    println(sortedArr.joinToString(", ")) 
    }