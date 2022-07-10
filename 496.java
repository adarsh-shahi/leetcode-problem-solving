import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[] {2,4}, new int[] {1,2,3,4})));
    }

    private static int[] solve(int[] nums1, int[] nums2){
      int[] ans = new int[nums1.length];
      for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
          if(nums1[i] == nums2[j]){
            boolean foundGreater = false;
            for (int k = j + 1;  k < nums2.length; k++) {
              if(nums2[k] > nums2[j]){
                 ans[i] = nums2[k];
                 foundGreater = true;
                 break;
              }
            }
            if(!foundGreater) ans[i] = -1;
          }
        }
      }
     return ans;
    }
    
}
