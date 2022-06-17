// https://leetcode.com/problems/sort-array-by-parity/
import java.util.*;
class solve {
    public static void main(String[] args) {
       for(int e: solve(new int[] {0}))
                System.out.println(e+ " ");
    }

    private static int[] solve(int[] nums){
        int vaccant = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                int temp = nums[vaccant];
                nums[vaccant] = nums[i];
                nums[i] = temp;
                vaccant++;
            }
        }
        return nums;
    }
    
}