import java.util.*;
class solve {
    public static void main(String[] args) {
        for(int[] arr : solve(5)){
          System.out.println(Arrays.toString(arr));
        }
    }

    private static int[][] solve(int n){
      int[][] ans = new int[n][n];

      int rightLimit = ans.length - 1;
      int downLimit = ans.length - 1;
      int upLimit = 0;
      int leftLimit = 0;
      int count = 1;

      for (int i = 0; i < ans.length; i++) {

        for (int j = leftLimit; j <= rightLimit; j++) {
          ans[upLimit][j] = count;
          count++;
        }
        
        for (int j = upLimit + 1; j <= downLimit; j++) {
          ans[j][rightLimit] = count;
          count++;
        }
        for (int j = rightLimit - 1; j >= leftLimit; j--) {
          ans[downLimit][j] = count;
          count++;
        }
        for (int j = downLimit - 1; j > upLimit; j--) {
          ans[j][leftLimit] = count;
          count++;
        }
        rightLimit--;
        downLimit--;
        leftLimit++;
        upLimit++;
        
      }


      return ans;
    }
    
}
