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
    
   for (int i = 0; i < 2 * n - 1; i++) {
    for (int c = 0; c <= i && i < n; c++) {
      System.out.print("*");
    }
    if(i == n - 1){ 
      System.out.println();
      continue;
    }
    
    
    for (int j = 0; j < 2 * n - i - 1 && i >= n; j++) {
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