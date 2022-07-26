import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[] {9,12,5,10,14,3,10},10)));
    }

    private static int[] solve(int[] nums, int pivot){
      int ans[] = new int[nums.length];
      int p = 0;
      int l = nums.length - 1;
      for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
       if(nums[i] < pivot) ans[p++] = nums[i];
       if(nums[j] > pivot) ans[l--] = nums[j]; 
      }
      for (int i = 0; i < nums.length; i++) {
        if(nums[i] == pivot) ans[p++] = nums[i]; 
       }
       return ans;
     
    }
    
}
