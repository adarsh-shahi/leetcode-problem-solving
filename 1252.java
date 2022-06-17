// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
import java.util.*;
class solve {
    public static void main(String[] args) {
        int[][] nums = {
            {0,1},
            {1,1}
        };
       System.out.println(solve(2, 3, nums));
    }

    private static int solve(int m, int n,int[][] indices){
        int[][] matrix = new int[m][n];

        for(int i = 0; i < indices.length; ++i){
            for(int j = 0; j < indices[i].length; ++j){

                
                if(j == 0){   // getting row and updating all columns init
                    for(int k = 0; k < n; k++){
                        matrix[indices[i][j]][k] += 1;
                    }
                }
                else{ // j == 1 // getting column and updating all rows init
                    for(int k = 0; k < m; k++){
                        matrix[k][indices[i][j]] += 1;
                    }
                }
            }
        }
        int isOdd = 0;
        for(int i = 0; i< matrix.length; ++i){
            for(int j = 0; j < matrix[i].length; ++j){
                if(matrix[i][j] % 2 != 0) isOdd++;
            }
        }
        return isOdd;
    }
}