
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

// Greedy
class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        intervals.sortBy { it[1] }

        // [[1, 2], [2, 3], [1, 3], [3, 4]]

        var count = 0
        var lastInterval = intervals[0][1] // 2

        for (interval in 1 until intervals.size) {
            if (intervals[interval][0] < lastInterval) {
                count++
            } else {
                lastInterval = intervals[interval][1]
            }
        }
        return count
    }
}