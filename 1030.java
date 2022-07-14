import java.util.*;
class solve {
    public static void main(String[] args) {
        int[][] ans = solve(2, 2, 0, 1);
        for(int[] e: ans) System.out.println(Arrays.toString(e));
    }

    private static int[][] solve(int rows, int cols, int rCenter, int cCenter){
        int[][] coordinates = new int[rows * cols][];
        int p = 0;
        int[] distance = new int[rows*cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int[] instance = new int[2];
                instance[0] = i;
                instance[1] = j;
                distance[k++] = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                coordinates[p++] = instance;

            }
        }

        System.out.println(Arrays.toString(distance));
        for(int[] e : coordinates) System.out.println(Arrays.toString(e));

        for (int i = 0; i < distance.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < distance.length - 1 - i; j++) {
                if(distance[j] > distance[j + 1]){
                    isSorted = false;
                    int temp = distance[j];
                    distance[j] = distance[j + 1];
                    distance[j + 1] = temp;
                    int[] temp1 = coordinates[j];
                    coordinates[j] = coordinates[j + 1];
                    coordinates[j + 1] = temp1;
                }
            }
            if(isSorted) { 
                System.out.println(Arrays.toString(distance));
                return coordinates;
            }
        }
        System.out.println(Arrays.toString(distance));

        return coordinates;
    }
    
}
