// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
import java.util.*;
class solve {
    public static void main(String[] args) {
        int[] nums = {5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        System.out.println(solve(nums, 7));
    }

    private static int solve(int[] nums, int k){
        int count = 0;
        for(int i = 0; i < nums.length; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if((nums[i] == nums[j]) && ((i * j) % k == 0)){
                    count++;
                }
            }
        }

        return count;

    }
    
}