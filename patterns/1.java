class solve{
  public static void main(String[] args) {
    solve1(5,5);
  }

  static void solve(int n){
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void solve1(int r, int c){
    if(r == 0 )return;
      for (int j = 0; j < c; j++) {
        System.out.print("*");
      }
      System.out.println();
      solve1(r - 1, c);
  }
}