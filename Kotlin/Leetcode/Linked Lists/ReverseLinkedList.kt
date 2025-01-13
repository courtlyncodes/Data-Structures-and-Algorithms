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
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) {
            return head
        }

        var curr = head // 1
        var prev: ListNode? = null // null

        while(curr != null) {

            var nextTemp = curr!!.next // 2
            curr.next = prev // curr.next = null 
            prev = curr // prev = 1
            curr = nextTemp // 2
        }
        return prev
    }
}