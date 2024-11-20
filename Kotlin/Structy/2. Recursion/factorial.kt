fun factorial(n: Int): Int {
    if(n == 1) {
        return 0
    } 
       return n * factorial(n-1)
 }
 
 fun main() {
     println(factorial(3))
   
 }