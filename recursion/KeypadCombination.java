package recursion;

//Time Complexity: O(4^n)
public class KeypadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) {
        findCombination("23", 0, "");

    }

    public static void findCombination(String str, int ind, String combination) {
        if (ind == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(ind);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            findCombination(str, ind + 1, combination + mapping.charAt(i));
        }
    }
}
