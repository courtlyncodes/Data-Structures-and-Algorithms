
fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
    intervals.sortBy { it[1] }
    
    var finalList = mutableListOf<IntArray>()
    var result = 0
    println(intervals.contentDeepToString())
    
    for (interval in intervals.indices) {
        if (finalList.isEmpty() || intervals[interval][0] >= finalList.last()[1]) {
            finalList.add(intervals[interval])
        } else {
            result++
        }
    }
    return result
}

