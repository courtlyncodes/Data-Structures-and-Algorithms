import java.util.*


fun getFibonacciSumNaive(n: Long): Long {
    if (n <= 1) return n

    val reduced = n % 60L

    if(reduced <= 1) return reduced
    
    var previous: Long = 0
    var current: Long = 1
    var sum: Long = 1

    for (i in 0 until reduced) {
        val tmpPrevious = previous
        previous = current
       	current = (current + tmpPrevious) % 10  
        sum = (sum + current) % 10
    }

    return sum % 10
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val s = getFibonacciSumNaive(n)
    println(s)
}