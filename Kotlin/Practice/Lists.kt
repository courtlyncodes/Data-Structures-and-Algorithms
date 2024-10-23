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
