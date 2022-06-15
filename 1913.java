// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
import java.util.*;
class solve {
    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,4,8};
        System.out.println(solve(nums));
        
    }

    private static int solve(int[] nums){
        int high = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        int secondLow = Integer.MAX_VALUE;
        

        for(int i = 0; i < nums.length; ++i){

            if(nums[i] > high){
                 secondHigh = high;
                 high = nums[i];
            }
            else if(secondHigh < nums[i]) secondHigh = nums[i];

            if(nums[i] < low){
                secondLow = low;
                 low = nums[i];
            }
            else if(secondLow > nums[i]) secondLow = nums[i];
            
        }
       
        return (high * secondHigh) - (low * secondLow);
    }
}
