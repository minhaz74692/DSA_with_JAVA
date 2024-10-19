
package recursion;

import java.util.HashSet;

public class SubsequencesOfSringUnique { // Time Complexity is : O(2^n)
    public static void subsequnces(String str, int ind, String newString, HashSet<String> set) {
        if (ind == str.length()) {
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currentChar = str.charAt(ind);
        // System.out.println("Current char is: "+ currentChar);
        subsequnces(str, ind + 1, newString + currentChar, set);
        subsequnces(str, ind + 1, newString, set);
    }

    public static void main(String args[]) {
        subsequnces("aaa", 0, "", new HashSet<>());
    }
}
