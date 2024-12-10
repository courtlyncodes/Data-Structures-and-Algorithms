import java.util.*

fun calcFib(n: Long): Long {
    if(n <= 1) return n

    var arr = mutableListOf(0L, 1L)
   
    for(i in 2..n) {
        arr.add(arr[arr.size -1] + arr[arr.size - 2])
    }
    return arr.last()
}
