package LeetCode_Problems.LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Problem206 {
    

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; 
        ListNode current = head; 

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev; 
            prev = current; 
            current = nextNode; 
        }

        return prev; 
    }

    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0)
            return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 };
        ListNode head = createLinkedList(values);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedHead);
    }

}