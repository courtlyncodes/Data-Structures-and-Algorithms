// Problem:
// You are given an array of intervals, where each interval is represented as a pair [start, end], 
	// 	and you are tasked with determining if a person could attend all the meetings.
// For a person to attend all meetings, no two meetings should overlap.

// Input:
// // An array of intervals intervals, where each element is a pair [start, end], representing a meeting's start and end time.

// Output:
// Return true if a person can attend all meetings, false otherwise.

// Example 1:
// Input: intervals = [[0, 30], [5, 10], [15, 20]]
// Output: false
// Explanation: 
// - Meeting 1 (0, 30) overlaps with Meeting 2 (5, 10).
// - Meeting 1 (0, 30) also overlaps with Meeting 3 (15, 20).

// Example 2:
// Input: intervals = [[7, 10], [2, 4]] 
// [2,4] [7, 10]
// Output: true
// Explanation: 
// - Meeting 1 (7, 10) and Meeting 2 (2, 4) do not overlap.

fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
    intervals.sortBy { it[1] }
    
    var lastInterval = intervals[0][1]
    for (i in 1 until intervals.size) {
        if (intervals[i][0] < lastInterval) {
            return false
        }
            lastInterval = intervals[i][1]
    }
    return true
}

fun main() {
     val intervals = arrayOf(
        intArrayOf(0, 30),
        intArrayOf(5, 10),
        intArrayOf(15, 20),
    )
     
   println(canAttendMeetings(intervals))
   
    val intervals2 = arrayOf(
        intArrayOf(7, 10),
        intArrayOf(2, 4)
        
    )
     
   println(canAttendMeetings(intervals2))
}