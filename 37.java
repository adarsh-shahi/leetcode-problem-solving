import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class okay {
  public static void main(String[] args) {
    char[][] input = {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
    sudoku(input);
    for (int i = 0; i < input.length; i++) {
      System.out.println(Arrays.toString(input[i]));
    }
  }

  static boolean sudoku(char[][] s) {

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (s[i][j] == '.') {
          for (char k = '1'; k <= '9'; k++) {
            if (checkHorizontal(i, j, k, s) && checkVertical(i, j, k, s) && checkSub(i, j, k, s)) {
              s[i][j] = k;
              if (sudoku(s))
                return true;
              s[i][j] = '.';
            }
          }
          return false;
        }

      }
    }
    return true;

  }

  static boolean checkSub(int i, int j, char k, char[][] a) {
    int row = -1;
    int column = -1;
    if (i / 3 == 0)
      row = 0;
    if (i / 3 == 1)
      row = 3;
    if (i / 3 == 2)
      row = 6;
    if (j / 3 == 0)
      column = 0;
    if (j / 3 == 1)
      column = 3;
    if (j / 3 == 2)
      column = 6;
    for (int l = row; l < row + 3; l++) {
      for (int m = column; m < column + 3; m++) {
        if (a[l][m] == k) {
          return false;
        }
      }
    }
    return true;
  }

  static boolean checkVertical(int i, int j, char k, char[][] a) {
    for (int l = 0; l < 9; l++) {
      for (int m = 0; m < 1; m++) {
        if (a[l][j] == k)
          return false;
      }
    }
    return true;
  }

  static boolean checkHorizontal(int i, int j, char k, char[][] a) {
    for (int m = 0; m < 9; m++) {
      if (a[i][m] == k)
        return false;
    }
    return true;
  }
}