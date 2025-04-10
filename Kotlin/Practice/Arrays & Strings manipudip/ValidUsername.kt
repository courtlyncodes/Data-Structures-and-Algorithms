fun CodelandUsernameValidation(str: String): String { 
    var set = setOf('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', )
    // check length
    if (str.length < 4 || str.length > 25) return "false"
     // if first is not a letter or last is an underscore return false
    if (!str[0].isLetter() || str[str.length - 1] == '_') return "false"
    // loop through str
    for (s in str) {
      if (!s.isLetterOrDigit() && s != '_') {
        return "false"
      }
    }
      // if first char is a letter 
        // check the rest for letters, nums, underscore
       
    // code goes here  
    return "true"
    
  }