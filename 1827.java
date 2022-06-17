// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
import java.util.*;
class solve {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,1};
        System.out.println(solve(nums));
    }

    private static int solve(int[] nums){

        int operations = 0;
        for(int i = 1 ; i  < nums.length; ++i){
            if(nums[i] > nums[i - 1]) continue;
            else{ 
            operations += (nums[i - 1] + 1) - nums[i];
            nums[i] = nums[i - 1] + 1;
            }
        } 

        return operations;
    }
    
}
