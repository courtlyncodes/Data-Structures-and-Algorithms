const reverseList = list => {
    let prev = null
    let curr = list
    
    while (curr) {
       let nextTemp = curr.next
       curr.next = prev
       prev = curr
       curr = nextTemp
    }
    return prev
}