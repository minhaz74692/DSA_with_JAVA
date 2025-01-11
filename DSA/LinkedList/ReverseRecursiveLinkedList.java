package DSA.LinkedList;

public class ReverseRecursiveLinkedList {
    Node head;
    int size;

    ReverseRecursiveLinkedList() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null ;
        return newHead;
    }

    public static void main(String[] args) {
        ReverseRecursiveLinkedList list = new ReverseRecursiveLinkedList();
        list.addLast(0);
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);
        list.printList();
        list.head= list.reverseRecursive(list.head);
        list.printList();

        //Revese Linked List


    }
}
