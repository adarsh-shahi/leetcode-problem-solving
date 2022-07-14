import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,4}));
    }

    private static boolean solve(int[] arr){
      Arrays.sort(arr);
      boolean isAP = true;
      int diff = arr[1] - arr[0];
      for (int i = 1; i < arr.length - 1; i++) {
        if(arr[i + 1] - arr[i] != diff) return false;
      }
     return isAP;
    }
    
}
