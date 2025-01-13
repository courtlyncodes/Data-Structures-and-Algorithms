class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null || head.next == null) {
            return false
        } 

        var slow = head
        var fast = head.next

        while(fast != null && fast.next != null) {
            if(slow == fast) {
                return true
            } else {
                slow = slow!!.next
                fast = fast.next.next
            }
        }
        return false
    }
}

// Hash Set implementation
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

 class Solution {
    fun hasCycle(head: ListNode?): Boolean {
      var set = mutableSetOf<ListNode?>()
      var curr = head

      while(curr != null) {
        if(!set.contains(curr)) {
            set.add(curr)
            curr = curr.next
        } else {
            return true
        }
      } 
      return false
    }
}