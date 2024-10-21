package wallpaper
import kotlin.math.ceil

fun wallpaper(l: Double, w: Double, h: Double): String {
    val arr =
        arrayOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty"
        )

    val safeLength = 0.52 * 10.0
    val area = (2 * (l * h) + 2 * (w * h)) * 1.15
    val buy = ceil(area / safeLength).toInt()

    if (l == 0.0 || w == 0.0) {
        return arr[0]
    } else {
        return arr[buy]
    }
}