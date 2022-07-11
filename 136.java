import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1}));
    }

    private static int solve(int[] nums){
      int ans = 0;
      for (int i = 0; i < nums.length; i++) 
        ans ^= nums[i];
      return ans;
    }
}