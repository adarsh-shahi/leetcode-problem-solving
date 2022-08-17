package backtracking;

class solve{
  public static void main(String[] args) {
      solve(0,0);
  }

  static void solve(int r, int c){
    if(c >= 3 || r >= 3) return;
    System.out.println(r + " " + c);
    if(r == 2 && c == 2 ){
      System.out.println("Found");
      return;
    }
    solve(r, c + 1);
    solve(r + 1, c);
  }
}