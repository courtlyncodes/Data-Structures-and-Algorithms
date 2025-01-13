//first
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.floor

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int {
    var sum = (age1*age1 + age2*age2 + age3*age3 + age4*age4 + age5*age5 + age6*age6 + age7*age7 + age8*age8).toDouble()
    
    return floor((sqrt(sum)/ 2)).toInt()
}

//optimized
import kotlin.math.sqrt
import kotlin.math.floor
import kotlin.math.pow

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
  var sum = listOf(age1, age2, age3, age4, age5, age6, age7, age8)
    .sumOf { it.toDouble().pow(2) }
    
    return floor(sqrt(sum) / 2).toInt()
}