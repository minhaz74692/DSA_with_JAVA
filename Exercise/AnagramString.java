public class AnagramString {
    public static void main(String args[]){
        String a = "Hello";
        String b = "ell.oH";
        boolean result =  anagram(a, b);
        System.out.println(result);

        StringBuilder c = new StringBuilder("Hello");
        c.delete(0, 1);
        System.out.println(c);
       
    }

    import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are not the same, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to count characters in both strings
        int[] charCount = new int[26]; // Since the problem assumes only lowercase letters

        // Count characters in both strings
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1));  // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2));  // Output: false
    }
}

}
