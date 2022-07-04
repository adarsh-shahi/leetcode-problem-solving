import java.util.*;
class solve {
  public static void main(String[] args) {
    int[][] mat = {
            {1,0,0,0,0,0,0},
            {1,1,0,0,0,0,0},
            {1,1,1,1,0,0,0},
            {1,0,0,0,0,0,0},
            {1,1,1,1,1,0,0},
            {1,1,1,1,1,1,0}

    };
    for(int e: solve(mat, 5)) System.out.println(e);
}

private static int[] solve(int[][] mat, int k){
  int[] noOfSoldiers = new int[mat.length];
  int count = 0;
  for (int i = 0; i < mat.length; i++) {
      count = 0;
      for (int j = 0; j < mat[i].length; j++) {
          if(mat[i][j] == 1) count++;
      }
      noOfSoldiers[i] = count;
  }

  int[] weakest = new int[k];
  int l = 0;

  for (int i = 0; i < noOfSoldiers.length; ) {
      while (noOfSoldiers[i] < 0) i++;
      int min = noOfSoldiers[i];
      weakest[l] = i;
      for (int j = i + 1; j < noOfSoldiers.length; j++) {
          if (noOfSoldiers[j] >= 0 && min > noOfSoldiers[j]) {
              min = noOfSoldiers[j];
              weakest[l] = j;
          }
      }
      if(noOfSoldiers[weakest[l]] == 0) noOfSoldiers[weakest[l]] = -1;
      else noOfSoldiers[weakest[l]] = -noOfSoldiers[weakest[l]];
      l++;
      if(l == weakest.length) break;

  }

  return weakest;
}
}