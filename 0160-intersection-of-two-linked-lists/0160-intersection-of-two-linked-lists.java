/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int bCount=0,aCount=0;
        ListNode temp;
        temp = headA;
        while(temp!=null){
            aCount++;
            temp = temp.next;
        }

        temp = headB;
        while(temp!=null){
            bCount++;
            temp = temp.next;
        }

        if(bCount>aCount){
            int difference = bCount-aCount;
            while(difference!=0){
                headB = headB.next;
                difference--;
            }
        }else{
            int difference = aCount-bCount;
            while(difference!=0){
                headA = headA.next;
                difference--;
            }
        }

        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}