/* List Practice Problems: */ 


// 1. Create a list of integers from 1 to 5.
val integers = listOf(1, 2, 3, 4, 5)

// 2. Create a mutable list of strings and add three items: "Apple", "Banana", "Cherry".
var fruits = mutableListOf("Apple", "Banana", "Cherry")
var fruits = mutableListOf<String>("Apple", "Banana", "Cherry")

// 3. Initialize a list of names and print the name at the second position.
val names = listOf("Arderian", "Brittney", "Courtlyn")
println(names[1])

// 4. Create an empty list of integers and add the numbers 10, 20, and 30.
var ints = mutableListOf<Int>()
ints.addAll(10, 20, 30)

// 5. Create a list of characters from a string "Kotlin" and print the last character.
fun convertKotlin(kotlin: String): Char {
    var chars = mutableListOf<Char>()
    for(char in kotlin) {
        chars.add(char)
    }
    println(chars[chars.size-1])
    println(chars[5])
}

// 6. Create a mutable list of any type (Any) and add elements of different types: an integer, a string, and a float.
var anyList = mutableListOf<Any>()
anyList.add(5)
anyList.add("Hey there")
anyList.add(45.99)

// 7. Create a list of three different animals and check if the list contains "Dog".
val animals = listOf("Dog", "Elephant", "Fox")
println(animals.contains("Dog"))

// 8. Create a mutable list and remove the second element.
var removable = mutableListOf(8, 19, 90)
removable.remove(removable[1])

// 9. Reverse a list of numbers [5, 10, 15, 20] and print the result.
val numbers = listOf(5, 10, 15, 20)
println(numbers.reversed())

// 10. Create a list of 5 strings and sort them in alphabetical order.
var strings = listOf("Nia", "Chanel", "Imani", "Naiari", "Nayla")
val sortedStrings = strings.sorted() 
println(sortedStrings)  


// 11. Sum of Even Numbers: Create a list of integers from 1 to 100. Write a function that returns the sum of all even numbers in the list.
// should return 2550
fun returnEvenSum(): Int {
    var integers = mutableListOf<Int>()
    var sum = 0

    for(i in 1..100) {
        integers.add(i)
    }

    for(int in integers) {
        if(int % 2 == 0) {
            sum += int
        }
    }
    return sum 
}


// 12. Find Maximum: Create a list of floating-point numbers. Write a function that returns the maximum value in the list.
// rounding
fun returnMax(): Double {
    // create the immutable list of doubles with at least 3 values unordered
    val floatingNumbers = listOf(17.99, 18.50, 12.59, 34.99, 25.99, 29.99, 5.99, 11.99, 8.00, 11.99)
    // creating a storage variable holds the current max
    var max = floatingNumbers[0] // 17.99
    // loop through the FPN in the list comparing the current number to the number after it
    for(f in floatingNumbers) {
        if(f > max) { 
            // whichever number is higher would be stored as the current max
            max = f
        }
    }
   return max
}

// 13. Count Occurrences: Create a list of strings. Write a function that takes a string as input and returns the number of times it appears in the list.
fun countOccurances(s: String): Int {
    val strings = listOf("Mary", "Mary", "Mary", "Megan", "Mary", "Missy", "Mariah")
    var count = 0

    return strings.count { it == s }
}

// 14. Remove Duplicates: Create a list of integers with some duplicates. Write a function that returns a new list containing only unique integers.
fun removeDupes(): List<Int> {
    val integers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 6, 5, 5, 6, 7, 3, 2)

    return integers.distinct()
}

// 15. Sort in Descending Order: Create a list of random integers. Write a function that returns a sorted list in descending order.
fun sort(): List<Int> {
    val integers = listOf(10, 500, 60, 75, 643, 58, 5365, 6, 729, 36, 24)

    return integers.sortedDescending()
}
