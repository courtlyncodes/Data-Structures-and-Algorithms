import java.util.*

fun optimalPoints(segments: MutableList<Segment>): Pair<Int, List<Int>> {   
    var points = mutableListOf<Int>()
    var count = 1
    val sortedSegments = segments.sortedBy { it.end }
    var lastSegment = sortedSegments[0]
    
    points.add(sortedSegments[0].end)

    for (i in 1 until sortedSegments.size) {
        val currentSegment = sortedSegments[i]
        if(currentSegment.start > lastSegment.end) {
            lastSegment = currentSegment
            points.add(lastSegment.end)
            count++
        }
    }
    return Pair(count, points.toList())
}

class Segment(var start: Int, var end: Int)

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val segments = ArrayList<Segment>(n)
    repeat (n) {
        val start: Int = scanner.nextInt()
        val end: Int = scanner.nextInt()
        segments += Segment(start, end)
    }
    val points = optimalPoints(segments)
    println(points.size)
    for (point in points) {
        print(point.toString() + " ")
    }
}