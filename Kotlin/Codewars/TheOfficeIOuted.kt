// first
fun outed(meet: Map<String, Int>, boss: String): String {
    val attendees = meet.toMutableMap()
    
    attendees[boss]?.let { attendees[boss] = it * 2 }
    
    val values = attendees.values.sum()
    
    if(values / attendees.size <=5) {
        return "Get Out Now!"
    }  else {
        return "Nice Work Champ!"
    }
}

// Optimal
fun outed(meet: Map<String, Int>, boss: String) = if((meet.values + meet[boss]!!).average <=5 ) "Get Out Now!" else "Nice Work Champ!"