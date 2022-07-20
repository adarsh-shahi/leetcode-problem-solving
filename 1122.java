import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[] {28,6,22,8,44,17}, new int[] {22,28,8,6})));
    }

    private static int[] solve(int[] arr1, int[] arr2){
      int[] ans = new int[arr1.length];
      int p = 0;
      for (int i = 0; i < arr2.length; i++) {
        for (int j = 0; j < arr1.length; j++) {
          if(arr2[i] == arr1[j]){
             ans[p++] = arr1[j];
             arr1[j] = -1;
          }
        }
      }
      int count = 0;
      int uniqueDraft[] = new int[arr1.length - 1];
      for (int i = 0; i < arr1.length; i++) {
        if(arr1[i] != -1) uniqueDraft[count++] = arr1[i];
      }

      int[] unique = new int[count];
      for (int i = 0; i < unique.length; i++) {
        unique[i] = uniqueDraft[i];
      } 

      Arrays.sort(unique);

      for (int i = p, j = 0; i < ans.length; i++, ++j) {
        ans[i] = unique[j];
      }

     return ans;
    }
    
}
