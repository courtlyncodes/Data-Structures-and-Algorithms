class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = 0
        var max = 0
        var maxProfit = 0

        for(i in prices.indices){
            if(prices[min] > prices[max]){
                min = max
            } else {
                if(prices[max] - prices[min] > maxProfit){
                    maxProfit = prices[max] - prices[min]
                }
            }
            max++
        }
        return maxProfit
    }
}