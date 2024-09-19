//first
package countdig

fun nbDig(n:Int, d:Int):Int {
    // your code
    var count = 0
    var string = ""
    var arr = mutableListOf<Int>()
    
    for(num in 0..n){
        arr.add(num * num)
    }
    
    for(int in arr){
        string += int.toString()
        }
    
    for(char in string){
        if(char.digitToInt() == d){
            count++
        }
    }
    return count
}
