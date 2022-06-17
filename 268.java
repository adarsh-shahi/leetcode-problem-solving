// https://leetcode.com/problems/first-missing-positive/
import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,0}));
    }

    private static int solve(int[] nums){
        int i = 0; 
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
            else 
                ++i;
        }

        System.out.println(Arrays.toString(nums));
        int find = 1;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > 0){
                if(nums[j] != find)
                    return find;
                else{
                    find++;
                }
            }
        }
        return find;
    }
    
}