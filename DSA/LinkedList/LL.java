package DSA.LinkedList;

class LL {

    Node head; // Declare the head node

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondLastNode = lastNode;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
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

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}