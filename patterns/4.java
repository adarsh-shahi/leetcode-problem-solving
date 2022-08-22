class solve {
  public static void main(String[] args) {
    solve(5);
    solve1(5,5);

    /*

    1
    22
    333
    4444
    55555
     
     */
  }

  static void solve(int n) {
   for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
      System.out.print(i+1);
    }
    System.out.println();
   }
  }

  static void solve1(int r, int c) {
    if(r == 0)return;
    for (int i = 0; i <= c - r; i++) {
      System.out.print(c-r+1);
    }
    System.out.println();
    solve1(r - 1, c);
  }
}