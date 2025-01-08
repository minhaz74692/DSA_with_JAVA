package DSA.LinkedList;

class LL {

    Node head; // Declare the head node
    int size;

    LL() {
        this.size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add -- first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Delete: first, last
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The List is Empty to delete");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {

            System.out.println("The List is Empty to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public int getSize() {
       return this.size;
    }

    // print
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

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("Linked List");

        list.printList();

        list.addFirst("This");
        
        System.out.println(list.getSize());

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}