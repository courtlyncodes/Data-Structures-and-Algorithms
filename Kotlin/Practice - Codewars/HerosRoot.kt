package hero
import kotlin.math.abs

fun intRac(n:Long, guess:Long):Long {
    var count: Long = 0
    var currGuess: Long = guess
    var prevGuess: Long = 0
    var num: Long
    
    while(abs(currGuess - prevGuess) >= 1){
        num = ((currGuess + (n / currGuess)) / 2)
        prevGuess = currGuess
        currGuess = num
        count++
    }
    return count
}