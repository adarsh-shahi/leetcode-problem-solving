import java.util.*;
class solve {
    public static void main(String[] args) {
        for(int e: solve(new int[] {-4,-1,0,0,3,10})) System.out.println(e);
    }

    private static int[] solve(int[] nums){
      int i = 0;
      int j = nums.length - 1;
      int p = nums.length - 1;
      int[] ans = new int[nums.length];
      while(p > -1){
        if(Math.abs(nums[i]) > Math.abs(nums[j]))
          ans[p] = nums[i] * nums[i++];
        else 
          ans[p] = nums[j] * nums[j--];
        p--;    
      }
      return ans;
     
    }
    
}
