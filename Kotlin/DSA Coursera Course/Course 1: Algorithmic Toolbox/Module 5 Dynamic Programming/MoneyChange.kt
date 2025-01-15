// Money Change Again Problem

// Compute the minimum number of coins needed to change the given value into coins with denominations 1, 3, and 4.
// Input: An integer money.
// Output: The minimum number of coins with denominations 1, 3, and 4 that changes money.

var memo = hashMapOf<Int, Int>()

fun moneyChange(money: Int): Int {
    if(money <= 0) return 0
    
    if(memo.contains(money)) {
        return memo[money]!!
    }
    
 
    var first = moneyChange(money - 1) + 1
    var second = moneyChange(money - 3) + 1
    var third = moneyChange(money - 4) + 1
        
    memo[money] = minOf(minOf(first, second), third)
   
    
    return memo[money]!!
    
}
    
fun main() {
    println(moneyChange(0))  // Expected output: 0
    println(moneyChange(10)) // Expected output: 3 (3+3+4)
    println(moneyChange(34)) // Expected output: 9
    println(moneyChange(61)) // Expected output: 16
    println(moneyChange(97)) // Expected output: 25
}