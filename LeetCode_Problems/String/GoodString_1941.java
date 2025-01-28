package LeetCode_Problems.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GoodString_1941 {
    public static boolean areGoodString(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        Set<Integer> frequencies = new HashSet<>(charCount.values());
        return frequencies.size() == 1;
    }

    public static void main(String args[]){
        System.out.println(areGoodString("aabbccs"));
    }
}
