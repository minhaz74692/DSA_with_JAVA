package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
    public static void main(String args[]) {
        int[] input = {1,4,3};
     int result = findMissing(input);
     System.out.println(result);
    }

    public static int findMissing(int[] nums) {
        int maxNum = nums[0];
        int minNum = nums[0];
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        for (int j = minNum; j <= maxNum; j++) {
            if (!numList.contains(j)) {
                return j;
            }
        }
        return 0;
    }
}
