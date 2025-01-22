package DSA.Queue_DS;

public class QueueAtLinkedList {

    static Node head;
    static Node tail;
    static int size;

    QueueAtLinkedList() {
        size = 0;
    };

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void remove() {
        if (isEmpty()) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }

        System.out.print(currNode.data);
    }

    public void printTail() {
        if (tail == null) {
            System.out.println("Tail is Null");
            return;
        }

        System.out.println("Tail is: " + tail.data);
    }

    public static void main(String args[]) {
        QueueAtLinkedList ll = new QueueAtLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.remove();
        }
    }
}
