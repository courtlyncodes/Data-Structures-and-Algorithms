// Write a function, maxValue, that takes in array of numbers as an argument. The function should return the largest number in the array.

// Solve this without using any built-in array methods.

// You can assume that the array is non-empty.

fun maxValue(nums: MutableList<Int>): Int {
   var max = nums[0]

   for(n in nums.indices) {
       if(nums[n] > max) {
           max = nums[n]
       } else {
           continue
       }
   }
    return max
}

fun main() {
    val numbers = mutableListOf(4, 7, 2, 8, 10, 9)
 	println(maxValue(numbers))
}