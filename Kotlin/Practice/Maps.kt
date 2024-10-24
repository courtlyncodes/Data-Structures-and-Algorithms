/* Map Practice Problems: */


// 1. Create a map with three key-value pairs: 1 -> "One", 2 -> "Two", 3 -> "Three".
val numbersMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")

// 2. Create an empty mutable map and add a key-value pair: "Kotlin" -> 2011.
var kotlin = mutableMapOf<String, Int>()
kotlin.put("Kotlin", 2011)

// 3. Initialize a map of string keys and integer values, then get the value associated with the key "Age".
val person = mapOf("Year" to 1990, "Age" to 34, "Day" to 19)
println(person["Age"])

// 4. Create a mutable map with two entries and update the value of one of the keys.
var updated = mutableMapOf("Color" to "Pink", "Show" to "Breaking Bad")
updated["Show"] = "The Boys"

// 5. Remove an entry from a map with keys "Apple", "Banana", "Cherry" and print the result.
var fruits = mutableMapOf("Apple" to "Red", "Banana" to "Yellow", "Cherry" to "Maroon")
println(fruits.remove("Apple"))

// 6. Check if a map contains the key "UserID" and print the result.
val person = mapOf("Year" to 1990, "Age" to 34, "Day" to 19)
println(person.contains("UserID"))

// 7. Create a map of strings and double values representing product prices, and print all the keys.
val prices = mapOf("Apple Watch" to 299.99, "iPhone" to 1500.00, "MacBook" to 6999.99)
println(prices.keys)

// 8. Create a mutable map and check if a certain value exists, like "Kotlin" -> 2011.
var fruits = mutableMapOf("Apple" to "Red", "Banana" to "Yellow", "Cherry" to "Maroon")
println(fruits.containsKey("Kotlin"))

// 9. Create a map with keys as names of months and values as the number of days, then print the value for "February".
val months = mapOf("January" to 31, "February" to 28, "March" to 31, "April" to 30, "May" to 31, "June" to 30, "July" to 31, "August" to 31, "September" to 30, "October" to 31, "November" to 30, "December" to 31)
println(months["February"])

// 10. Create a map with 3 keys, remove one of the entries, and add a new entry in its place.
var removing = hashMapOf(10 to 11, 12 to 13, 14 to 16)
removing.remove(14)
removing.put(14, 15)

// 11. Merge Maps: Create two maps with string keys and integer values. Write a function that merges them into one map, summing the values for duplicate keys. Return the resulting map.

// 12. Filter Map by Value: Create a map with string keys and integer values. Write a function that returns a new map containing only the entries with values greater than a specified threshold.

// 13. Get All Keys: Create a map with keys as countries and values as their populations. Write a function that returns a list of countries with populations above a certain number.

// 14. Invert Map: Create a map where keys are names and values are ages. Write a function that returns a new map where the keys and values are inverted (ages become keys and names become values).

// 15. Count Key Lengths: Create a map with string keys and string values. Write a function that returns a new map where the keys are the lengths of the original keys, and the values are lists of the original keys that have that length.