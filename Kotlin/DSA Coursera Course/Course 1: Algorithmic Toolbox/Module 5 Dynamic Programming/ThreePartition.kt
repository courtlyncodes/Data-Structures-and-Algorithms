// Splitting the Pirate Loot: 3-Partition Problem
// Partition a set of integers into three subsets with equal sums.
// Input: A sequence of integers
// Output: Check whether it is possible to partition them into three subsets with equal sums, i.e., check whether there exist three disjoint sets 

fun pirateLoot(list: IntArray): Int {
    var target = list.sum()
    
    if(list.size < 3) return 0
    if(target  % 3 != 0) return 0
   
    var subset1 = mutableListOf<Int>()
    var subset2 = mutableListOf<Int>()
    var subset3 = mutableListOf<Int>()
    
    private fun backtrack(i: Int): Boolean {
        for(i in list.indices) {
        if(i == list.size - 1) {
            return sumOf(subset1) == target && sumOf(subset2) == target && sumOf(subset3) == target
        } 
        
        var curr = list[i]
        
        if subset1.sum() + curr <= target {
            subset1.add(curr)
          	if()
        }

    }
    
    
    }
    
}
