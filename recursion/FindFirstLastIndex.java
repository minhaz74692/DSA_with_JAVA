package recursion;

public class FindFirstLastIndex {
    public static int first = -1;
    public static int last = -1;

    public static void elementIndex(String str, char elm, int ind) {
        if (ind == str.length()) {
            System.out.println("First: " + first + " and Last: " + last);
            return;
        }
        if (str.charAt(ind) == elm) {
            if (first == -1) {
                first = ind;
            } else {
                last = ind;
            }
        }
        elementIndex(str, elm, ind + 1);

    }

    public static void main(String args[]) {
        String inp = "Hell s s l sfd";
        elementIndex(inp, 'l', 0);  // "l" means a String but 'l' means the character
    }
}
