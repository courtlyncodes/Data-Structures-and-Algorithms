//first
package allinclusive

fun containAllRots(strng: String, arr: ArrayList<String>): Boolean {
    val hashset = HashSet<String>()

    if (strng.isNotEmpty()) {
        for (s in 1 until strng.length + 1) {
            hashset.add(strng.substring((s - 1), strng.length) + strng.substring(0, s - 1))
        }

        for (element in hashset) {
            if (!arr.contains(element)) {
                return false
            }
        }
    }
    return true
}

//optimizedpackage allinclusive

package allinclusive

fun containAllRots(strng: String, arr: ArrayList<String>): Boolean {
    val hashset = HashSet<String>()

    if (strng.isNotEmpty()) {
        for (s in 1 until strng.length + 1) {
            var rotation = strng.substring(s - 1, strng.length) + strng.substring(0, s - 1)
            if (!arr.contains(rotation)) {
                return false
            }
        }
    }
    return true
}

// highly concise
package allinclusive

fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
    return arr.containsAll(List(strng.length) { (strng.drop(it) + strng.take(it)) })
}