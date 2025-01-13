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
    fun middleNode(head: ListNode?): ListNode? {
        // if(head!!.next == null || head!!.next.next == null) {
        //     return head
        // }

        var slow = head // 1
        var fast = head // 3

        while(fast != null && fast!!.next != null) {
            slow = slow!!.next // 2 //3
            fast = fast.next.next //4 //5

            }
            return slow
        }
    }