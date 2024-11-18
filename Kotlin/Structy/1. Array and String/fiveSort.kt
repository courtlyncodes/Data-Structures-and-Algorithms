fun fiveSort(nums: IntArray): IntArray {
    var i = 0
    var j = nums.size -1
     
  while(i < j) {
        
        if(nums[i] == 5) {
            var temp = nums[i]
            
            nums[i] = nums[j]
            nums[j] = temp
            j--
            
        } else {
            i++
        }
        
    }
    return nums
}

fun main() {
    println(fiveSort(intArrayOf(12, 5, 1, 5, 12, 7)).contentToString())
  
}