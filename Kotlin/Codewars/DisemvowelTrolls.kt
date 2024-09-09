//first
fun disemvowel(str: String): String {
    val map = mapOf<Char, Int>('a' to 1, 'e' to 2, 'i' to 3, 'o' to 4, 'u' to 5)
    var newStr = ""
    
    for(i in str){
        if(!map.containsKey(i.lowercaseChar())){
            newStr += i
        }
    }
    return newStr
}

//optimized
fun disemvowel(str: String): String {
    val list = listOf('a', 'e', 'i', 'o', 'u')
    return str.filter { !list.contains(it.lowercaseChar()) }
}
