// https://leetcode.com/problems/array-partition-i/
import java.util.*;
class solve {
    public static void main(String[] args) {
       System.out.println(solve(new int[] {6,2,6,5,1,2}));
    }

    private static int solve(int[] nums){
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i += 2) {
            max += nums[i];
        }
        return max;
    }
    
}
