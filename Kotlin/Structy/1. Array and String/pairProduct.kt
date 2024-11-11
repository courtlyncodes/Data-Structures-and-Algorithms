// Write a function, pairProduct, that takes in an array and a target product as arguments. The function should return an array containing a pair of indices whose elements multiply to the given target. The indices returned must be unique.

Be sure to return the indices, not the elements themselves.

There is guaranteed to be one such pair whose product is the target.

fun pairProduct(numbers: IntArray, target: Int): IntArray {
    var map = mutableMapOf<Int, Int>()
    var arr = mutableListOf<Int>()
    
    for(n in numbers.indices) {
        map.put(numbers[n], n)
    }
    
   for (n in numbers) {
        if (n == 0) continue // Skip if n is zero to avoid division by zero

        val factor = target.toDouble() / n.toDouble() // Perform floating-point division
        if (factor == factor.toInt().toDouble()) { // Check if factor is an integer
            val factorInt = factor.toInt() // Convert factor back to integer
            if (map.contains(factorInt) && n != factorInt) {
                arr.add(map[n]!!) // Use !! to assert non-null because map[n] should exist
                arr.add(map[factorInt]!!)
                break // You can break if you only want the first pair found
            }
        }
    }
    return arr.toIntArray()
}

fun main() {
 println(pairProduct(intArrayOf(3, 2, 5, 4, 1), 8).contentToString())
 println(pairProduct(intArrayOf(3, 2, 5, 4, 1), 10).contentToString())
 println(pairProduct(intArrayOf(4, 7, 9, 2, 5, 1), 5).contentToString())
 println(pairProduct(intArrayOf(4, 7, 9, 2, 5, 1), 35).contentToString())
 println(pairProduct(intArrayOf(3, 2, 5, 4, 1), 10).contentToString())
 println(pairProduct(intArrayOf(4, 6, 8, 2), 16).contentToString())
}