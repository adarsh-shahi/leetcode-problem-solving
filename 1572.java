// https://leetcode.com/problems/matrix-diagonal-sum/

import java.util.*;
class solve {
    public static void main(String[] args) {
       int[][] matrix = {
        {7,3,1,9},
        {3,4,6,9},
        {6,9,6,6},
        {9,5,8,5}
        
       };
       System.out.println(solve(matrix));
    }

    private static int solve(int[][] matrix){
        int startRow = 0;
        int startColumn = 0;
        int endRow = 0;
        int endColumn = matrix[0].length - 1;

        int sum = 0;
        for(int i = 0; i < matrix.length; ++i){
           sum += (matrix[startRow][startColumn] + matrix[endRow][endColumn]);
           System.out.println(sum);
           startRow++; startColumn++; endRow++; endColumn--;
          
        }
        if(matrix.length % 2 != 0) sum -= matrix[matrix.length/2][matrix.length/2];
        return sum;
    }
}
