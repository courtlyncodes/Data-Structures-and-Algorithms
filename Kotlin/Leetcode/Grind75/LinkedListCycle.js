const hasCycle = head => {
    if(head === null || head.next === null) {
        return false
    }
    let slow = head
    let fast = head.next

    while(fast && fast.next) {
        if(slow === fast) {
            return true
        } 
        else {
            slow = slow.next
            fast = fast.next.next
        }
       
    } 
    return false
}