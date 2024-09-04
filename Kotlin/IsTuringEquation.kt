fun isTuringEquation(s: String): Boolean {
    val regex = "\\d+".toRegex()
  
      val digitGroups: List<String> = regex.findAll(s).map { it.value }.toList()
  
      val num1 = digitGroups[0]
      var num2 = digitGroups[1]
      var sum = digitGroups[2]
      
      return if (num1.reversed().toLong() + num2.reversed().toLong() == sum.reversed().toLong()) true else false
  }