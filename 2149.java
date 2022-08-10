import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[] {3,1,-2,-5,2,-4})));
    }

    private static int[] solve(int[] nums){
      int[] nas = new int[nums.length];
      int p = 0;
      int l = nums.length - 1;
      for(int i = 0, j = nums.length - 1; i < nums.length; i++, j-- ){
        if(nums[i] > 0) {
          nas[p] = nums[i];
          p+=2;
        }
        if(nums[j] < 0 ) {
          nas[l] = nums[j];
          l-=2;
        }
      }
     return nas;
    }
}
