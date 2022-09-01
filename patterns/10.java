class solve {
  public static void main(String[] args) {
    solve(5);
  //  solve1(5,5);

    /*

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *


     
     */
  }

  static void solve(int n) {
    int copy = 0;
   for (int i = 0; i < 2 * n - 1; i++) {
    for (int c = 0; c <= i && i < n && copy != n - 1; c++) {
      System.out.print("*");
      copy = c;
      if(copy == n - 1) System.out.println();
    }
    
    
    for (int j = 0; j < 2 * n - i - 2 && copy == n - 1; j++) {
      System.out.print("*");
    }
    
    System.out.println();
    
   }
  }

  static void solve1(int r, int c) {
    if(r == 0)return;
    for (int i = 0; i < c - r; i++) {
      System.out.print(" ");
    }
    for (int i = 0; i < r * 2 - 1; i++) {
      System.out.print("*");
    }
    
   
    System.out.println();
    solve1(r - 1, c);
  }
}