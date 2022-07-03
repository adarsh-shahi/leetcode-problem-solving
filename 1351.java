import java.util.*;
class solve {
    public static void main(String[] args) {
        int[][] array = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        System.out.println(solve(array));
    }

    private static int solve(int[][] matrix){

        int count = 0;
        for (int i = matrix.length - 1; i > -1; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0){
                    count += matrix[i].length - j;
                    break;
                }
            }
        }
        return count;
    }
    
}