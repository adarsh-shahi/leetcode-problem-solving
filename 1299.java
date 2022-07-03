import java.util.*;
class solve {
    public static void main(String[] args) {
        for(int e: solve(new int[] {17,18,5,4,6,1})){
          System.out.print(e + " ");
        }
    }

    private static int[] solve(int[] array){
      int[] replace = new int[array.length];

      for (int i = 0; i < replace.length; i++) {
        int max = 0;
        for (int j = i + 1; j < replace.length; j++) {
          if(array[j] > max) max = array[j];
        }
        replace[i] = max;

      }
      replace[replace.length - 1] = -1;

      return replace;
    }
    
}
