/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */
      class Solution: VersionControl() {
        override fun firstBadVersion(n: Int) : Int {
            var left: Long = 1
            var right: Long = n.toLong()
    
            while(right >= left) {
                var mid = left + (right - left) / 2
                if(isBadVersion(mid.toInt())) {
                        right = mid - 1
                    } else {
                    left = mid + 1
                }
            }
             return left.toInt()
        }
    }