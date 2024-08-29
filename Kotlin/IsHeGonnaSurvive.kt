//first
fun hero(bullets: Int, dragons: Int) : Boolean = if(bullets / 2 < dragons) false else true

//optimized
fun hero(bullets: Int, dragons: Int) : Boolean = bullets / 2 >= dragons
