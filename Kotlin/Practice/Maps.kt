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
fun merge(): Map<String, Int> {
    val mapOne = mapOf("Apple" to 5, "Orange" to 6, "Apple" to 6, "Avocado" to 7, "Squash" to 5, "Broccoli" to 8)
    val mapTwo = mapOf("Apple" to 7, "Kiwi" to 4, "Strawberry" to 10, "Banana" to 8, "Raspberry" to 9, "Coconut" to 7)

    var mergedMap = mutableMapOf<String, Int>()

    for((k, v) in mapOne) {
        if(!mergedMap.containsKey(k)) {
            mergedMap[k] = v
        } else {
            mergedMap[k] += v
        }
    }

    for((k, v) in mapTwo) {
        if(!mergedMap.containsKey(k)) {
            mergedMap[k] = v
        } else {
            mergedMap[k] += v
        }
    }

    return mergedMap
}

// 12. Filter Map by Value: Create a map with string keys and integer values. Write a function that returns a new map containing only the entries with values greater than a specified threshold.
fun greatest(i: Int): HashMap<String, Int> {
    val mapOne = mapOf("Apple" to 5, "Banana" to 6, "Cucumber" to 8, "Dragonfruit" to 11, "Eggplant" to 8, "Fig" to 3, "Grapes" to 6, "Horseradish" to 11)

    // var mapTwo = mutableMapOf<String, Int>()

    // for((k, v) in mapOne) {
    //     if(v > i){
    //         mapTwo.set(k, v)
    //     }
    // }
    // return mapTwo.toHashMap()

   return HashMap(mapOne.filter { (k, v) -> v > i })
}

// 13. Get All Keys: Create a map with keys as countries and values as their populations. Write a function that returns a list of countries with populations above a certain number.
fun countries(p: Int): List<String> {
    val countryMap = mapOf("United States" to 35873849, "Canada" to 48737433, "Spain" to 487939478, "France" to 39483987, "Italy" to 394783974, "Jamaica" to 34398573, "Nigeria" to 398473974)

    val newMap = countryMap.filter{ (k, v) -> v > p }

    return (newMap.keys).toList()

}

// 14. Invert Map: Create a map where keys are names and values are ages. Write a function that returns a new map where the keys and values are inverted (ages become keys and names become values).
fun invert(): HashMap<Int, String> {
    val mapOne = mapOf("Courtlyn" to 34, "Arderian" to 32, "Sheila" to 61, "Robert" to 64, "Jada" to 24, "Jasmine" to 28, "KJ" to 14)

    var mapTwo = mutableMapOf<Int, String>()

    for((k, v) in mapOne) {
        mapTwo[v] = k
    }
    return mapTwo
}

// 15. Count Key Lengths: Create a map with string keys and string values. Write a function that returns a new map where the keys are the lengths of the original keys, and the values are lists of the original keys that have that length.
fun countKeyLengths(): HashMap<Int, List> {
    val strings = mapOf("Atlanta" to "Georgia", "Chicago" to "Illinois", "Mobile" to "Alabama", "Washington" to "DC", "New York" to "New York", "Seattle" to "Washington", "Orlando" to "Florida", "Portland" to "Oregon" )

    var newMap = mutableMapOf<Int,MutableList<String>>()

    for((k, v) in strings) {
        if(!newMap.contains(k.length)){
            newMap.set(k.length, mutableListOf())
        } 
        newMap[k.length]?.add(k)
    }
    
    return newMap.toHashMap()
}