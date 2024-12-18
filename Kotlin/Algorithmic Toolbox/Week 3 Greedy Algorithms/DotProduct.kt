import java.util.*

fun maxDotProduct(a: IntArray, b: IntArray): Long {
    if (a.isEmpty() || b.isEmpty()){
        return 0 
    }
    var result: Long = 0
    
    var arrayA = a.sortedDescending()
    var arrayB = b.sortedDescending()

    while (arrayA.isNotEmpty() && arrayB.isNotEmpty()) {
        result += (arrayB.first() * arrayA.first())
        arrayA = arrayA.drop(1)
        arrayB = arrayB.drop(1)
    }
    
    return result
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }
    val b = IntArray(n)
    for (i in 0 until n) {
        b[i] = scanner.nextInt()
    }
    println(maxDotProduct(a, b))
}