import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(solve(new String[] {"zyx","wvu","tsr"}));
  }

  private static int solve(String[] str) {
    int count = 0;
    for (int j = 0; j < str[0].length(); ++j) {
      for (int i = 0; i < str.length - 1; i++) {
        if (str[i].charAt(j) > str[i + 1].charAt(j)) {
          count++;
          break;
        }
      }
    }
    return count;
  }
}