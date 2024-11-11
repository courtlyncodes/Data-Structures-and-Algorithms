
// Write a function, mostFrequentChar, that takes in a string as an argument. The function should return the most frequent character of the string. If there are ties, return the character that appears earlier in the string.

You can assume that the input string is non-empty.
fun mostFrequentChar(s: String): Char {
    var map = LinkedHashMap<Char, Int>()
    
    for(char in s) {
		if(!map.contains(char)) {
            map.put(char, 1)
        } else {
           map[char] = (map.get(char) ?: 0) + 1
        }
   }
   val max = map.maxOf { it.value }
   val char = map.entries.filter { it.value == max }.map { it.key }
   return char[0]
}

fun main() {
 	println(mostFrequentChar("bookeeper"))
    println(mostFrequentChar("davidr"))
    println(mostFrequentChar("abby"))
    println(mostFrequentChar("mississippi"))
    println(mostFrequentChar("potato"))
    println(mostFrequentChar("eleventennine"))
    println(mostFrequentChar("riverbed")) 
}