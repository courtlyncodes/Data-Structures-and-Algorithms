import java.util.*

fun maxDotProduct(a: IntArray, b: IntArray): Long {
    if(a.isEmpty() || b.isEmpty()) {
        return 0
    }
  	
    var result = 0L
    
    val arrayA = a.sortedDescending()
    val arrayB = b.sortedDescending()
    
	
    for(i in arrayA.indices) {
        result += arrayA[i].toLong() * arrayB[i].toLong()
    }
    
    return result
}

fun main() {
    val array1 = intArrayOf(23)
    val array2 = intArrayOf(39)
    val result = maxDotProduct(array1, array2)
    println(result) 

    val array3 = intArrayOf(2, 3, 9)
    val array4 = intArrayOf(7, 4, 2) 
    val result2 = maxDotProduct(array3, array4)
    println(result2) 
    
    val array5 = intArrayOf(14, 8)
    val array6 = intArrayOf(7, 4, 2) 
    val result3 = maxDotProduct(array5, array6)
    println(result3) 
    
    val array7 = intArrayOf(14, 8)
    val array8 = intArrayOf() 
    val result4 = maxDotProduct(array7, array8)
    println(result4) 
    
    val array9 = intArrayOf()
    val array10 = intArrayOf() 
    val result5 = maxDotProduct(array9, array10)
    println(result5) 
}