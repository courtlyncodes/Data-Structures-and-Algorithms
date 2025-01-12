//Binary Search with Duplicates Problem
// Find the index of the first occurrence of a key in a sorted array.
    // Input: A sorted array of integers (possibly with duplicates) and an integer q.
    // Output: Index of the first occurrence of q in the array or “−1”  if q does not appear in the array.

    fun findDuplicates(arr: IntArray, n: Int): Int {
        var left = 0
        var right = (arr.size - 1)
        
        while(right >= left){
            var mid = right + left / 2
        
        if(n == arr[mid]) {
            if(mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid
            } else {
                right = mid - 1
            }
        } else if(n < arr[mid]) {
            right = mid - 1
        } else {
            left = mid + 1
        }
        }
        return -1
    }
    
    fun main() {
        val arr1 = intArrayOf(2, 4, 4, 4, 7, 7, 9)
        val x1 = 4
        println(findDuplicates(arr1, x1))
        
        val arr2 = intArrayOf(-1, 0, 3, 5, 9, 12)
        val x2 = 2
        println(findDuplicates(arr2, x2))
        
    }