import java.util.*;
class solve {
    public static void main(String[] args) {
      int[][] points = {
        {1,2},
        {3,1},
        {2,4},
        {2,3},
        {4,4}
      };
        System.out.println(solve(3,4, points));
    }

    private static int solve(int x, int y, int[][] points){
      List<List<Integer>> list = new ArrayList<>();
      for (int i = 0; i < points.length; i++) {
        if(points[i][0] == x || points[i][1] == y){
          List<Integer> current = new ArrayList<>(); 
          current.add(points[i][0]);
          current.add(points[i][1]);
          list.add(current);
        }
      }

      int minDistance = Integer.MAX_VALUE;
      int m = -1;
      int n = -1;

      for (int i = 0; i < list.size(); i++) {
        if(minDistance > (Math.abs(list.get(i).get(0) - x)  + Math.abs(list.get(i).get(1) - y))){
          minDistance = Math.abs(list.get(i).get(0) - x) + Math.abs(list.get(i).get(1) - y);
          m = list.get(i).get(0);
          n = list.get(i).get(1);
        }
      }

      System.out.println(m + " " + n);


      for (int j = 0; j < points.length; j++) {
        if(points[j][0] == m && points[j][1] == n){
          return j;
        }
      }




     return -1;
    }
    
}
