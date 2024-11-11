// Write a function, anagrams, that takes in two strings as arguments. The function should return a boolean indicating whether or not the strings are anagrams. Anagrams are strings that contain the same characters, but in any order.

fun anagrams(s1: String, s2: String): Boolean {
    return (s1.toCharArray().sorted().joinToString("") == s2.toCharArray().sorted().joinToString(""))
}

fun main() {
 	println(anagrams("restful", "fluster")) // -> true
    println(anagrams("cats", "tocs")) // -> false
    println(anagrams("night", "thing")); // -> true
  
}