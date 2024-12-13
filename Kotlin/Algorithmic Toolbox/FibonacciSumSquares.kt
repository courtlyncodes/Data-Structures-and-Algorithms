import java.util.*

fun getFibonacciSumSquaresNaive(n: Long): Long {
    if (n <= 1) return n

 	val reducedN = n % 60L

    var previous = 0L
    var current = 1L
    var sum = 1L

    for (i in 2..reducedN) {
        val tmpPrevious = previous
        previous = current
        current = (tmpPrevious + current) % 10
        sum = (sum + (current * current)) % 10
}

    return sum % 10
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val s = getFibonacciSumSquaresNaive(n)
    println(s)
}