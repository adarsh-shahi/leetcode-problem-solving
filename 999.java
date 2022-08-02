import java.util.*;
class solve {
    public static void main(String[] args) {
      char[][] board = {
        {'.','.','.','.','.','.','.','.'},
        {'.','.','.','p','.','.','.','.'},
        {'.','.','.','p','.','.','.','.'},
        {'p','p','.','R','.','p','B','.'},
        {'.','.','.','.','.','.','.','.'},
        {'.','.','.','B','.','.','.','.'},
        {'.','.','.','p','.','.','.','.'},
        {'.','.','.','.','.','.','.','.'}
      };
        System.out.println(solve(board));
    }

    private static int solve(char[][] board){
      int row = -1;
      int column = -1;
      boolean isFound = false;
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
          if(board[i][j] == 'R'){
            row = i;
            column = j;
            isFound = true;
            break;
          }
        }
        if(isFound) break;
      }

      // Find in the left part of Rook
      int leftCount = 0;
      for(int i = column - 1; i >= 0; i--){
        if(board[row][i] == 'B') break;
        else if(board[row][i] == 'p') {
          leftCount++;
          break;
        }
      }

      int rightCount = 0;
      for(int i = column + 1; i < board[row].length; i++){
        if(board[row][i] == 'B') break;
        else if(board[row][i] == 'p') {
          rightCount++;
          break;
        }
      }

      int upCount = 0;
      for(int i = row - 1; i >= 0; i--){
        if(board[i][column] == 'B') break;
        else if(board[i][column] == 'p') {
          upCount++;
          break;
        }
      }

      int downCount = 0;
      for(int i = row + 1; i < board.length; i++){
        if(board[i][column] == 'B') break;
        else if(board[i][column] == 'p') {
          downCount++;
          break;
        }
      }
     return leftCount + rightCount + downCount + upCount;
    }
}
