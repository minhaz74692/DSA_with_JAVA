package DSA.LinkedList;

import java.util.LinkedList;

public class LLByCollectionFramework {
    public static void printList(LinkedList<String> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");

        list.addLast("Linked List");

        list.addFirst("This");

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);
        list.removeLast();
        printList(list);
        list.removeLast();
        printList(list);

        System.out.println(list.size());
    }
}
