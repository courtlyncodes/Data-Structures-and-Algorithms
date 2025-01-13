import java.util.*

fun computeMinRefills(dist: Int, tank: Int, stops: IntArray): Int {
    // Edge case: If there are no stops and the distance exceeds the tank's range
    if (stops.isEmpty() && tank < dist) return -1

    // Add a virtual stop at the destination for easier calculations
    val allStops = stops + dist

    var currentPosition = 0
    var numRefills = 0
    var i = 0
    val n = allStops.size

    while (currentPosition < dist) {
        var farthestReachable = currentPosition

        // Find the farthest reachable stop within the current tank range
        while (i < n && allStops[i] <= currentPosition + tank) {
            farthestReachable = allStops[i]
            i++
        }

        // If no progress can be made, return -1
        if (farthestReachable == currentPosition) return -1

        // Update position and increment refill count if not at destination
        if (farthestReachable < dist) {
            numRefills++
        }

        currentPosition = farthestReachable
    }

    return numRefills
}

fun main() {
    val dist = 950
    val tank = 400
    val stops = intArrayOf(200, 375, 550, 750)
    val result = computeMinRefills(dist, tank, stops)
    println(result) // Output: 2

    val dist2 = 10
    val tank2 = 3
    val stops2 = intArrayOf(1, 2, 5, 9)
    val result2 = computeMinRefills(dist2, tank2, stops2)
    println(result2) // Output: -1

    val dist3 = 200
    val tank3 = 250
    val stops3 = intArrayOf(100)
    val result3 = computeMinRefills(dist3, tank3, stops3)
    println(result3) // Output: 0
}
