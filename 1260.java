import java.util.*;

import javax.xml.transform.TransformerFactoryConfigurationError;
class solve {
    public static void main(String[] args) {
        int[][] grid = {
            {3,8,1,9},
            {19,7,2,5},
            {4,6,11,10},
            {12,0,21,13}
        };
        System.out.println(solve(grid, 4));
    }

    private static List<List<Integer>> solve(int[][] grid, int k){
      List<List<Integer>> ans = new ArrayList<>();
      
      int[] oneDGrid = new int[grid.length * grid[0].length];

      if(grid.length * grid[0].length <= k) k -= grid.length * grid[0].length;

      for (int i = 0, p = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            oneDGrid[p++] = grid[i][j];
        }
      }

      for (int i = 0; i < k; i++) {
        int temp = oneDGrid[0];
        for (int j = 0; j < oneDGrid.length - 1; j++) {
            int next = oneDGrid[j + 1];
            oneDGrid[j + 1] = temp;
            temp = next;
        }
        oneDGrid[0] = temp;
      }
      for (int i = 0,p = 0; i < grid.length; i++) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < grid[i].length; j++) {
            list.add(oneDGrid[p++]);
        }
        ans.add(list);
      }
     return ans;
    }
    
}
