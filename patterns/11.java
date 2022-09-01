class solve {
  public static void main(String[] args) {
    solve(5);
  //  solve1(5,5);

    /*

  1
  01
  101
  0101
  10101



     
     */
  }

  static void solve(int n) {
    for (int i = 0; i < n ; i++) {
      for (int j = 0; j <= i; j++) {
        if((i & 1) == 1 && (j & 1) != 1) System.out.print(0); 
        else if((i & 1) == 0 && (j & 1) == 1) System.out.print(0);
        else System.out.print(1);

      }
      System.out.println();
    }
   }
}