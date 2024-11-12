// Write a function, uncompress, that takes in a string as an argument. The input string will be formatted into multiple groups according to the following pattern:

// <number><char>

// for example, '2c' or '3a'.
// The function should return an uncompressed version of the string where each 'char' of a group is repeated 'number' times consecutively. You may assume that the input string is well-formed according to the previously mentioned pattern.

fun uncompress(s: String): String {
    var result = StringBuilder()
    var i = 0
    
    while (i < s.length) {
        var num = 0
        while (s[i].isDigit()) {
            num = num * 10 + (s[i] - '0')
            i += 1
        }
        
        val char = s[i]
        i += 1
        
        result.append(char.toString().repeat(num))
        
	}
    return result.toString()
}

fun main() {
    println(uncompress("2c3a1t"))
    println(uncompress("4s2b"))
    println(uncompress("2p1o5p"))
    println(uncompress("3n12e2z"))
    println(uncompress("127y"))
}