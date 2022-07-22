import java.util.*;

class solve {
  public static void main(String[] args) {
    int[][] matrix = {
            {1,2,3,4,5},
    };
    System.out.println(solve(matrix));
}

private static boolean solve(int[][] matrix) {
    if (matrix.length == 1 || matrix[0].length == 1)
        return true;
    int startRow = matrix.length - 2;
    int startColumn = 0;
    int endRow = matrix.length - 1;
    int endColumn = 1;

    while (!(startRow == endRow && startColumn == endColumn)) {

        int iterrateRow = startRow;
        int iterrateColumn = startColumn;
        int value = matrix[startRow][startColumn];
        while (iterrateRow <= endRow && iterrateColumn <= endColumn) {
            if (matrix[iterrateRow][iterrateColumn] == value) {
                iterrateRow++;
                iterrateColumn++;
            } else {
                return false;
            }
        }

        if (startRow - 1 >= 0)
            startRow--;
        else if (startColumn + 1 < matrix[startRow].length)
            startColumn++;

        if (endColumn + 1 < matrix[endRow].length)
            endColumn++;
        else if (endRow - 1 >= 0)
            endRow--;
    }
    return true;
}
}
