package LeetCode_Problems.LinkedList;

public class Problem876MidlleOfLL {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle =turtle.next;
        }

        if(size % 2 == 0){
            return turtle.next;
        }
        return turtle;
    }
}
}
