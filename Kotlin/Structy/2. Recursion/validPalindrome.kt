// not optimal because subtring() creates a new string every time taking up memory

fun validPalindrome(s: String): Boolean {
    if(s.length == 0 || s.length == 1) {
        return true
    } 
    if(s.first() == s.last()) {
       return validPalindrome(s.substring(1, s.length - 1)) 
    }
    return false
}

fun main() {
    println(validPalindrome("courtlyn"))
    println(validPalindrome("kayak"))
  
}