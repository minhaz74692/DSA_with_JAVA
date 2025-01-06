package DSA.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractice {
    public static void main(String[] args){
        System.out.println("Hello");

        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(3);
        myList.add(8);
        myList.add(2);

        //Sorting
        Collections.sort(myList);

        System.out.println(myList);
    }
}
