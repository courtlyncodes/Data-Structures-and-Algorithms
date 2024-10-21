// brute force
package growth

fun nbYear(p0:Int, percent:Double, aug:Int, p:Int):Int {
    var current = p0
    var count = 0
    val growthRate = ((percent / 100) + 1)
  
    while(current < p) {  
        current = (current * growthRate).toInt() + aug
        count++
    }
    return count
}

// recursion
fun nbYear(p0:Int, percent:Double, aug:Int, p:Int):Int {
    val growthRate = percent / 100 + 1
    // base case 
    if(p0 >= p) {
        return 0
    }
    val newPop = (p0 * growthRate).toInt() + aug
    return 1 + nbYear(newPop, percent, aug, p)
}