import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new String[] {"d","b","c","b","c","a"}, 2));
    }

    private static String solve(String[] arr, int k){
      int[] counts = new int[arr.length];
      for(int i = 0; i < arr.length; ++i){
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
          if(arr[i].equals(arr[j])) count++;
        }
        counts[i] = count;
      }

      int c = 0;
      for (int i = 0; i < counts.length; i++) {
        if(counts[i] == 1) c++;
        if(c == k) return arr[i];
      }
      return "";
    }
}
