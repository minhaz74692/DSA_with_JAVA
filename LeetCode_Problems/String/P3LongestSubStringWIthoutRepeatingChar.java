package LeetCode_Problems.String;

import java.util.HashSet;
import java.util.Set;

public class P3LongestSubStringWIthoutRepeatingChar {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int size = s.length();
            if (size <= 1) {
                return size;
            }

            Set<Character> temp = new HashSet<>();
            int maxLength = 0;
            int left = 0; // Left pointer for the substring window

            for (int i = 0; i < size; i++) {
                char currentChar = s.charAt(i);

                // If duplicate character found, remove from the left until it's unique
                while (temp.contains(currentChar)) {
                    temp.remove(s.charAt(left));
                    left++;
                }

                // Add new character to the set
                temp.add(currentChar);

                // Update max length
                maxLength = Math.max(maxLength, temp.size());
            }

            return maxLength;
        }
    }
}
