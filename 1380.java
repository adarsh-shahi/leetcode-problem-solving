import java.util.*;
class solve {
    public static void main(String[] args) {
      int[][] matrix = {
        {7,8},
        {1,2}
      };
        System.out.println(solve(matrix));
    }

    private static List<Integer> solve(int[][] matrix){
      List<Integer> lucky = new ArrayList<>();
      for(int i = 0; i < matrix.length; ++i){
        int smallRow = -1;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[i].length; j++) {
          if(min > matrix[i][j]){
            min = matrix[i][j];
            smallRow = j;
          }
        }
        boolean isLucky = true;
        for (int j = 0; j < matrix.length; j++) {
          if(min < matrix[j][smallRow]){
            isLucky = false;
            break;
          }
        }
        if(isLucky) lucky.add(min);
      }
     return lucky;
    }
    
}