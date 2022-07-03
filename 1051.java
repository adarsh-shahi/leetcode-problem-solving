import java.util.*;
class solve {
    public static void main(String[] args) {
       System.out.println(solve(new int[] {1,1,4,2,1,3}));
    }

    private static int solve(int[] heights){
      int[] expected = new int[heights.length];
      for (int i = 0; i < expected.length; i++) {
        expected[i] = heights[i];
      }
      Arrays.sort(expected);
      
      int wrong = 0;
      for (int i = 0; i < expected.length; i++) {
        if(expected[i] != heights[i]) wrong++;
      }
      return wrong;
    }
    
}