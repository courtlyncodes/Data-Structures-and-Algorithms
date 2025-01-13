package target
import java.time.LocalDate;

fun dateNbDays(a0:Double, a:Double, p:Double):String {
    val percent = p / 36000
    var amt = a0
    var days = 0
    val startDate = LocalDate.of(2016, 1, 1)
    
    while(amt < a) {
        amt = amt * percent + amt
        days++
    }
    val finalDate = startDate.plusDays(days.toLong())

    return finalDate.toString()
    
}