package LeetCode_Problems.LinkedList;

class Problem143ReorderList {
    ListNode head;
    int size;

    Problem143ReorderList() {
        this.size = 0;
    };

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }

    public ListNode findMiddleNode(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    // Add -- first, last
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print
    public void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public ListNode reOrder(ListNode head) {
        ListNode firstNode = head;
        ListNode middle = findMiddleNode(head);

        ListNode secondHalf = reverse(middle.next);
        middle.next = secondHalf;
        printList(firstNode);
        ListNode fCurr = firstNode;
        ListNode sCurr = secondHalf;
        System.out.print(fCurr.data + " ");
        System.out.print(sCurr == null ? null : sCurr.data);
        System.out.println("");
        while (fCurr.next != middle.next && sCurr != null) {
            ListNode temp = fCurr.next;
            ListNode sTemp = sCurr.next;
            fCurr.next = sCurr;
            middle.next = sCurr.next;
            sCurr.next = temp;
            fCurr = temp;
            sCurr = sTemp;
            System.out.print(fCurr.data + " ");
            System.out.print(sCurr == null ? null : sCurr.data);
            System.out.println("");
        }
        printList(firstNode);
        return firstNode;
    }

    //LeetCode Problem: 61
    public ListNode RotateList(ListNode head, int k){
        ListNode result = head;
        for(int i =0; i<k; i++){
            // this.printList(head);
            result = singleRotate(result);
        }

        this.printList(result);


        return result;
    }

    public static ListNode singleRotate(ListNode head ){
        if(head == null || head.next == null){
            return head;
        }
        ListNode result = head;
        ListNode first = head;
        ListNode second = head.next;

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = second.next;
        second.next = result;
        result = second;
        return result;
    }

    public static void main(String args[]) {
        Problem143ReorderList list = new Problem143ReorderList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        // list.printList(list.head);
        // list.reOrder(list.head);
        list.printList(list.head);
        
        list.RotateList(list.head, 2);
        // list.printList(list.head);
    }

}