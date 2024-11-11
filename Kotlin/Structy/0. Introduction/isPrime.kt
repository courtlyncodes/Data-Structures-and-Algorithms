fun isPrime(n: Int): Boolean {
	if(n <= 1) return false
    if(n <= 3) return true
    
    if(n % 2 == 0 || n % 3 == 0) {
        return false
    }
    
    var i = 5 
    while(i * i <= n) {
        if(n % i == 0 || n % (i + 2) == 0) {
            return false
        } else {
            i += 6
        }
    }
    return true
}

fun main() {
 	println(isPrime(713)) // -> true
    println(isPrime(2)) // -> true
    println(isPrime(3)) // -> true
    println(isPrime(4)) // -> false
    println(isPrime(5)) // -> true
    println(isPrime(6)) // -> false
    println(isPrime(7)) // -> true
    println(isPrime(8)) // -> false
    println(isPrime(25)) // -> false
    println(isPrime(31)) // -> true
    println(isPrime(2017)) // -> true
    println(isPrime(2048)) // -> false
    println(isPrime(1)) // -> false
}