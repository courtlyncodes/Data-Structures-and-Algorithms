import java.util.*

fun getFibonacciLastDigitNaive(n: Int): Int {
    if (n <= 1)
        return n

    var previous = 0
    var current = 1

    for (i in 2..n) {
        val tmpPrevious = previous % 10
        previous = current
        current += tmpPrevious
    }

    return current % 10
}
