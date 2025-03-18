// Given a list of strings and a target character, return a new list containing only the strings that start with the target character, but formatted in title case (first letter uppercase, rest lowercase).
// Example: ["apple", "banana", "apricot", "blueberry"], target = "a" → ["Apple", "Apricot"]
 
fun filterFormatString(list: List<String>, target: Char): List<String> {
    var newList = mutableListOf<String>()
    
    for (string in list) {
        if (string.startsWith(target, ignoreCase = true)) {
            newList.add(string.replaceFirstChar { it.uppercase() })
        }
    }
    return newList
}

fun main() {
    var list = listOf("apple", "banana", "apricot", "blueberry")
    var target = 'a'
    
    println(filterFormatString(list, target))
        
}

// Time: O(n) -- looping through each element once
// Space: O(n) -- creating a new list to store the filtered and formatted strings