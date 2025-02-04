package LeetCode_Problems.Array;

public class P1800MaxAscSubArraySum {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int result = nums[0];
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    temp += nums[i];
                    if (temp > result) {
                        result = temp;
                    }
                } else {
                    temp = nums[i];
                }
            }
            return result;
        }
    }
}
