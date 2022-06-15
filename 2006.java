// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

import java.util.*;
class solve {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        System.out.println(solve(nums, 1));
    }

    private static int solve(int[] nums, int k){
        int count = 0;
        for(int i = 0; i < nums.length; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(Math.abs((nums[i] - nums[j])) == k) 
                    count++;
            }
        }
        return count;
    }
}