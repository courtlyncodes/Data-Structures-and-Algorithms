//first
fun highAndLow(numbers: String): String {
    var nums = numbers.split(" ")
    var high = nums[0]
    var low = nums[0]

    for (i in nums.indices) {
        if (nums[i].toInt() < low.toInt()) {
            low = nums[i]
        } else if (nums[i].toInt() > high.toInt()) {
            high = nums[i]
        }
    }

    return "${high} ${low}"
}
