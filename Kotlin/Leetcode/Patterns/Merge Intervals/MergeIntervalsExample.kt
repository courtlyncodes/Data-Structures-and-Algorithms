fun mergeIntervals(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it[0] }
    
    var result = mutableListOf<IntArray>()
    
    for(interval in intervals) {
         if (result.isEmpty() || result.last()[1] < interval[0]) {
        result.add(interval)
    } else {
        result.last()[1] = maxOf(result.last()[1], interval[1])
      }
    }
         return result.toTypedArray()
    
  }
  
  fun main() {
      val intervals = arrayOf(
          intArrayOf(1, 3),
          intArrayOf(2, 4),
          intArrayOf(3, 6)
      )
      
      val mergedIntervals = mergeIntervals(intervals)
      
     for (interval in mergedIntervals) {
          println("[${interval[0]}, ${interval[1]}]")
      }
  }