package recursion;

public class SubsequncesOfString { // Time Complexity is : O(2^n)
    public static void subsequnces(String str, int ind, String newString) {
        if (ind == str.length()) {
            // System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(ind);
        // System.out.println("Current char is: "+ currentChar);
        subsequnces(str, ind + 1, newString + currentChar);
        subsequnces(str, ind + 1, newString);
    }

    public static void main(String args[]) {
        subsequnces("ahbgdc", 0, "");
    }
}
