package recursion;

public class PutAllXInLast {
    public static void putAllXInLast(String str, char element, int index, int count, String newString) {
        if (index == str.length()) {
            System.out.println(count);
            for(int i  =0 ; i<count; i++){
                newString += element;
            }

            System.out.println("The final updated String is: " + newString);
            return;
        }
        if (str.charAt(index) == element) {
            count++;
        } else {
            newString += str.charAt(index);
        }
        putAllXInLast(str, element, index + 1, count, newString);
    }

    public static void main(String args[]) {
        putAllXInLast("Minhazul Islam", 'a', 0, 0, "");
    }
}
