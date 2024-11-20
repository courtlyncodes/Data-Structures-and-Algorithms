fun sumNumbersRecursive(numbers: IntArray): Int {
    if(numbers.size == 0) {
        return 0
    } 
       return numbers[0] + sumNumbersRecursive(numbers.sliceArray(1 until numbers.size))
 }
 
 fun main() {
     println(sumNumbersRecursive(intArrayOf(5, 2, 9, 10)))
   
 }