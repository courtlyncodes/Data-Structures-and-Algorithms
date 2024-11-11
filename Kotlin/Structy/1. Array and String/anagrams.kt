fun anagrams(s1: String, s2: String): Boolean {
    return if(s1.toCharArray().sorted().joinToString("") == s2.toCharArray().sorted().joinToString("")) true else false 
}

fun main() {
 	println(anagrams("restful", "fluster")) // -> true
    println(anagrams("cats", "tocs")) // -> false
    println(anagrams("night", "thing")); // -> true
  
}