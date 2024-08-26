class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()
        val arr = arrayListOf<Int>()

        for (i in nums.indices) {
            hashMap[i] = nums[i]
        }

        for ((key, value) in hashMap) {
            val complement = target - value

            for ((k, v) in hashMap) {
                if (v === complement && k != key) {
                    arr.add(key)
                    arr.add(k)
                    return arr.toIntArray()
                }
            }
        }
        return arr.toIntArray()
    }
}

//8.26
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val arr = mutableListOf<Int>()
        val map = mutableMapOf<Int, Int>()

        for(i in nums.indices) {
            map.set(nums[i], i)
        }

        for(i in nums.indices) {
            val complement = target - nums[i]

            if(map.containsKey(complement) && i != map.get(complement)) {
                    arr.add(i)
                    arr.add(map.getValue(complement))
                    return arr.toIntArray()
            }
                    
                } 
                 return arr.toIntArray()
            }
        }
      