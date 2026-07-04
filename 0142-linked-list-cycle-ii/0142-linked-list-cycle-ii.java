/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow,fast;
        slow = head;
        fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                slow = head; // reset slow to head
                while(slow != fast){ // run loop until again fast & slow don't collab
                    slow = slow.next; // moving slow by 1
                    fast = fast.next; // moving fast by 1 as well
                } 
                return slow;           
            }
        }
        return null;
    }
}