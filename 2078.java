import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {0,1}));
    }

    private static int solve(int[] colors){
      int max = 0;
      for (int i = 0; i < colors.length; i++) {
        for (int j = i + 1; j < colors.length; j++) {
          if(colors[i] != colors[j]){
            if(Math.abs(i - j) > max) max = Math.abs(i - j);
          }
        }
      }
     return max;
    }
    
}
