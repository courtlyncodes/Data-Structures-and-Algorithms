fun binarySearch(arr: MutableList<Int>, target: Int): Int? {
    var left = 0
    var right = arr.size

    while(right > left) {
        val indexToCheck = (right + left) / 2
        val checking = arr[indexToCheck]
        if(target == checking) {
            return indexToCheck
        } else if (target > checking) {
            left = indexToCheck + 1
        } else {
            right = indexToCheck
        }
    }
    return null
}