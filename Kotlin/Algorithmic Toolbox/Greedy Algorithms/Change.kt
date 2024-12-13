// Compute the minimum number of coins needed to change the given value into coins with denominations 1, 5, and 10.

// Input: An integer money.
// Output: The minimum number of coins with denominations 1, 5, and 10 that changes money.

import java.util.*

fun getChange(m: Int): Int {
    var sum = 0
    
    val dimes = m / 10
    sum += dimes
    val nickels = (m % 10) 
    sum += nickels / 5
    val pennies = nickels % 5
    sum += pennies

    return sum
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    println(getChange(m))
}