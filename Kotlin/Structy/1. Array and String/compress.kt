//Write a function, compress, that takes in a string as an argument. The function should return a compressed version of the string where consecutive occurrences of the same characters are compressed into the number of occurrences followed by the character. Single character occurrences should not be changed.

// 'aaa' compresses to '3a'
// 'cc' compresses to '2c'
// 't' should remain as 't'
// You can assume that the input only contains alphabetic characters.


fun compress(s: String): String {
	// loop through the string
    // count chars that are the same
    // concat the count to the string
    // concat the char to the string
    // start over
    
    var string = StringBuilder()
    var i = 0
    
    
    while (i < s.length) {
       val char = s[i]
        var count = 1
        
        while (i + 1 < s.length && s[i + 1] == char) {
            count++
            i++
        }
        
        string.append(count)
        string.append(char)
        
        i++
}     
    return string.toString()

}

fun main() {
    println(compress("ccaaatsss"))
    println(compress("ssssbbz"))
    println(compress("ppoppppp"))
    println(compress("nnneeeeeeeeeeeezz"))
    println(compress("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"))
}