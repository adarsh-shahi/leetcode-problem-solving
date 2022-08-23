import java.util.*;

class omkay {
  public static void main(String[] args) {
 
    // System.out.println(Arrays.toString(minOperations("001011")));
    int[][] points = {
      {8,7},
      {9,9},
      {7,4},
      {9,7}
    };

    System.out.println(minOperations(points));
  }

   static int minOperations(int[][] points) {
    int[] xaxis = new int[points.length];
        
    for(int i = 0; i < points.length; i++){
        xaxis[i] = points[i][0];
    }
    Arrays.sort(xaxis);
    int max = 0;
    for(int i = 0; i < xaxis.length - 1; i++){
        if(xaxis[i + 1] - xaxis[i] > max){
            max = xaxis[i + 1] - xaxis[i];
        }
    }
    
    return max;
}
}