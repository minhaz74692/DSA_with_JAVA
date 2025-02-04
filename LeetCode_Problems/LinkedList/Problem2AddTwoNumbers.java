package LeetCode_Problems.LinkedList;

public class Problem2AddTwoNumbers {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currNode = result;
        int temp = 0;
        while(l1 != null || l2 != null){
            int total = temp + (l1 != null ? l1.val : 0) + (l2 != null? l2.val : 0);
            int rem = total % 10;
            currNode.next = new ListNode(rem);
            currNode = currNode.next;
            temp = total / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if (temp > 0) {
            currNode.next = new ListNode(temp);
        }

        return result.next;
    }

}
    
}