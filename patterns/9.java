class solve {
  public static void main(String[] args) {
    solve(5);
  //  solve1(5,5);

    /*

        *
       ***
      *****
     *******
    *********
    *********
     *******
      *****
       ***
        *


     
     */
  }

  static void solve(int n) {
    for (int i = 0; i < 2 * n ; i++) {
      int spaceLimit = i < n ? n - i: i - n + 1;
      int starLimit = i < n ? i * 2 + 1 : 2 * (n - (i - n)) - 1;
     for (int j = 0; j < spaceLimit - 1; j++) {
      System.out.print(" ");
     }

     for (int j = 0; j < starLimit; j++) {
      System.out.print("*");
     }
     System.out.println();
    }
   }
}