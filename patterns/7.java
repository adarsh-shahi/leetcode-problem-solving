class solve {
  public static void main(String[] args) {
    solve(5);
   solve1(5,5);

    /*

     *
    ***
   *****
  *******
 *********
     
     */
  }

  static void solve(int n) {
   for (int i = 0; i < n; i++) {

    for (int j = 0; j < n - i; j++) {
      System.out.print(" ");
    }
    for (int j = 0; j < (i * 2) + 1 ; j++) {
      System.out.print("*");
    }
    System.out.println();
   }
  }

  static void solve1(int r, int c) {
    if(r == 0)return;
    for (int i = 0; i < r - 1; i++) {
      System.out.print(" ");
    }
    for (int i = 0; i < ((c-r) * 2) + 1; i++) {
      System.out.print("*");
    }
    System.out.println();
    solve1(r - 1, c);
  }
}