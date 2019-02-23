/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode newNode = null;
        ListNode head = null;
        int sum=0, carry=0;
        while(l1 != null || l2 != null) {
            sum = (l1 != null ? 
                (l1.val + (l2 !=null ? l2.val : 0)) :
                (l2 != null ? l2.val : 0))
                + carry;
            newNode = new ListNode(sum > 9 ?  sum%10 : sum);
            carry = sum < 9 ? 0 : sum/10;
            newNode.next = null;
            if (head != null) {
                head.next = newNode;
                head = newNode;
            } else {
                head = newNode;
                l3 = head;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        
        if(carry != 0) {
           newNode = new ListNode(carry);
           newNode.next = null;
           head.next = newNode; 
        }
        
        return l3;
    }
}