//Given a string, return a compressed version where consecutive duplicate characters are replaced with the character followed by the count.
// Example: "aaabbcddd" → "a3b2c1d3"

fun stringCompression(string: String): String {
    var result = StringBuilder()
    var hash = LinkedHashMap<Char, Int>()
    
    for(s in string) {
        hash[s] = hash.getOrDefault(s, 0) + 1
    }
    
    for ((s, i) in hash) {
        result.append(s)
        result.append(i)
    }
    return result.toString()
    
}

fun stringCompression(string: String): String {
    var result = StringBuilder()
    var left = 0
    
    for (right in 1 until string.length) {
        if (string[right] == string[right - 1]) {
            continue
        } else {
            result.append(string[left]).append(right - left)
            left = right
        }
        
    }
    result.append(string[left]).append(string.length - left)
    return result.toString()
}

fun main() {
	println(stringCompression("aaabbcddd"))
        
}