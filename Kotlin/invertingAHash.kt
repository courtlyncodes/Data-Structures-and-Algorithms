fun invertMap(hash: Map<Any, Any>): Map<Any, Any> {
    val invertedMap = mutableMapOf<Any, Any>()
    for ((key, value) in hash) {
     invertedMap[value] = key
    }
    return invertedMap
 }
 
 fun main() {
     val map: Map<Any, Any> = mapOf('a' to 1, 'b' to 2, 'c' to 3)
     println(invertMap(map))
 }

// 8.22
fun invertMap(hash: Map<Any, Any>): Map<Any, Any> {
    var newMap = mutableMapOf<Any, Any>()
    
    for((k, v) in hash) {
        newMap.put(v, k)
    }
    return newMap
}

//8.26

fun invertHash(hash: Map<Any, Any>): Map<Any, Any> {
    //create new map
    val newMap = mutableMapOf<Any, Any>()
    //loop through current hash
    for((k, v) in hash){
       //set values as keys from current hash into new hash 
       newMap.set(v, k)
    }
    //return new map
    return newMap
}