import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,3,4,5,6,7,8,9,0}));
    }

    private static int solve(int[] nums){
      for (int i = 0; i < nums.length; i++) 
        if(i % 10 == nums[i]) return i;
     return -1;
    }
}
