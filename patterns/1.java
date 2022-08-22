class solve{
  public static void main(String[] args) {
    solve(5);
  }

  static void solve(int n){
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}