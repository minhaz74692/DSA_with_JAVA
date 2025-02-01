package BackTracking;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BackTracking3 {
    // public List<List<Integer>> permute(int[] nums) {
    //     List<Integer> intList = Arrays.stream(nums).boxed().collect(Collectors.toList());
    //     printPermutation(intList);
    // }
    public static void printPermutation(List<Integer> nums, List<Integer> perm, List<List<Integer>> result) {
        if( nums.size() == 0){
            result.add(perm);
            System.out.println(result);
            return;
        }
        for(int i = 0; i<nums.size(); i++){
            int currentNum = nums.get(i);
            nums.remove(i);
            // printPermutation(nums, perm.add(currentNum) ,[2]);
        }
    }
    public static void main(String[] args) {
        
    }
}
