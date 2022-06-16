// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

import java.util.*;
class solve {
    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(solve(nums));
    }

    private static int solve(int[] nums){
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] > max){
                sMax = max;
                max = nums[i];
            }
            else if(nums[i] > sMax) sMax = nums[i];
        }

        return (max - 1) * (sMax - 1);
    }
    
}