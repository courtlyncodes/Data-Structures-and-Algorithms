fun reverseStringRecursive(s: String): String {
    if(s.length == 0) {
        return ""
    } 
       return s.get(s.length - 1) + reverseStringRecursive(s.substring(0, s.length - 1))
 }
 
 fun main() {
     println(reverseStringRecursive("courtlyn"))
   
 }