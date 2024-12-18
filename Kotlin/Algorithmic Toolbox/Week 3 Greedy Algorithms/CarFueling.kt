import java.util.*

fun computeMinRefills(dist: Int, tank: Int, stops: IntArray): Int {
    var currentPosition = 0
    var numRefills = 0
    var i = 0
    var n = stops.size

    if (currentPosition + tank >= dist) {
    return 0
} 
    
    while (currentPosition < dist) {
        var farthestReachable: Int

        if (i < n && stops[i] <= currentPosition + tank) {
            while (i < n && stops[i] <= currentPosition + tank) {
                i++
            }
            farthestReachable = if(i == 0) 0 else stops[i-1]
        } 
        else {
            farthestReachable = currentPosition
        }

        if (farthestReachable == currentPosition) {
            if (currentPosition + tank < dist) return -1
            else break
        } else {
            numRefills++
            currentPosition = farthestReachable
        }
    }
    return numRefills
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val dist = scanner.nextInt()
    val tank = scanner.nextInt()
    val n = scanner.nextInt()
    val stops = IntArray(n) 
    
    for (i in 0 until n) {
        stops[i] = scanner.nextInt()
    }

        println(computeMinRefills(dist, tank, stops))
    }

