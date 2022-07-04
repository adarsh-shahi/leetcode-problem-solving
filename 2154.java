import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {8,19,4,2,15,3}, 2));
    }

    private static int solve(int[] nums, int original){
      for (int i = 0; i < nums.length; ) {
        if(nums[i] == original) {
            original *= 2;
            System.out.println(nums[i] + " " + original);
            i = 0;
        }
        else i++;
    }
    return original;
    }
    
}
