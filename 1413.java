import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {-22,-29,-21,0,-4,-26,10,-11,-14,-11}));
    }

    private static int solve(int[] nums){
      int i ;
      for (i = 1; i < Integer.MAX_VALUE; i++) {
        boolean isFound = true;
        int copy = i;
        for (int j = 0; j < nums.length; j++) {
           copy += nums[j];
          if( copy < 1){
            isFound = false;
            break;
          }
        }
        if(isFound) break;
      }
     return i;
    }
    
}
