import java.util.*;
class solve {
    public static void main(String[] args) {
        for(int e: solve(new int[] {-4,-1,0,3,10})) System.out.println(e);
    }

    private static int[] solve(int[] nums){
     for (int i = 0; i < nums.length; i++) 
      nums[i] = (int) Math.pow(nums[i], 2);
     Arrays.sort(nums);
     return nums;
    }
    
}
