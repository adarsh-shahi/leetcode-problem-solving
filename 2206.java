// https://leetcode.com/problems/divide-array-into-equal-pairs/
import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,3,4}));
    }

    private static boolean solve(int[] nums){
        int pairs = nums.length / 2;
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] > 0 && nums[j] > 0 && nums[i] == nums[j]){
                        pairs--;
                        nums[i] = -nums[i];
                        nums[j] = -nums[j];
                }
            }
            if(pairs == 0){
                return true;
            }
        }
        return false;
    }
}
