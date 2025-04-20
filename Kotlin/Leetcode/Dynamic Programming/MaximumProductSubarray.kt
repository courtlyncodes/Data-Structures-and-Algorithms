    fun maxProduct(nums: IntArray): Int {
        var min = nums[0] // -48
        var max = nums[0] // 4
        var result = nums[0] // 28
    
        for (i in 1 until nums.size) {
            if (nums[i] < 0) {
            var temp = max // 
            max = min // 
                min = temp //
        }
            
            min = minOf(nums[i], min * nums[i]) // -400080u98
            max = maxOf(nums[i], max * nums[i]) // 28
            result = maxOf(max, result) // 28
        }
        
        return result
}