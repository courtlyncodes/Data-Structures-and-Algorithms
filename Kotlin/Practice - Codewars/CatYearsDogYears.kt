//first
fun calculateYears(years: Int): Array<Int> {
    val arr = mutableListOf<Int>()
    var catYears: Int = 15
    var dogYears: Int = 15
    arr.add(years)
    arr.add(catYears)
    arr.add(dogYears)

    if (years == 1) {
        return arr.toTypedArray()
    } else if (years >= 2) {
        arr[1] += 9
        arr[2] += 9
        for (i in 3..years) {
            arr[1] += 4
            arr[2] += 5
        }
    }
    return arr.toTypedArray()
}

//optimized
fun calculateYears(years: Int): Array<Int> {
    // Initialize cat and dog years
    var catYears = 15
    var dogYears = 15

    if (years >= 2) {
        catYears += 9
        dogYears += 9
    }
    if (years > 2) {
        catYears += (years - 2) * 4
        dogYears += (years - 2) * 5
    }

    return arrayOf(years, catYears, dogYears)
}

//more optimized
fun calculateYears(years: Int): Array<Int> {
    when(years){
        1 -> return arrayOf(1, 15, 15)
        2 -> return arrayOf(2, 24, 24)
        else -> return arrayOf(years, 24 + (years - ) * 4, 24 + (years - 2 * 5))
    }
}