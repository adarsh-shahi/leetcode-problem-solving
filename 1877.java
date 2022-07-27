import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {4,1,5,1,2,5,1,5,5,4}));
    }

    private static int solve(int[] nums){
        Arrays.sort(nums);
      int max = 0;
      for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++,j--) {
        if(max < nums[i]+nums[j]) max = nums[i]+nums[j];
      }
     return max;
    }
    
}
