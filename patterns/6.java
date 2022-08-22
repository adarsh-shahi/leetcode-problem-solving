class solve {
  public static void main(String[] args) {
    solve(5);
    solve1(5,5);

    /*

    12345
    1234
    123
    12
    1


     
     */
  }

  static void solve(int n) {
   for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i; j++) {
      System.out.print(j+1);
    }
    System.out.println();
   }
  }

  static void solve1(int r, int c) {
    if(r == 0)return;
    for (int i = 0; i < r; i++) {
      System.out.print(i+1);
    }
    System.out.println();
    solve1(r - 1, c);
  }
}