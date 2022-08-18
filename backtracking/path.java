package backtracking;

import java.util.ArrayList;

class solve{
  public static void main(String[] args) {
     System.out.println(solve2("",0,0));
  }

  static ArrayList<String> solve2(String p, int r, int c){
    if(c >= 3 || r >= 3) return new ArrayList<>();
    // System.out.println(r + " " + c);
    if(r == 2 && c == 2 ){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> l1 = solve2(p+"R", r, c + 1);
    ArrayList<String> l2 = solve2(p+"D", r + 1, c);
    l1.addAll(l2);
    return l1;
  }

  static void solve(String p, int r, int c){
    if(c >= 3 || r >= 3) return;
    // System.out.println(r + " " + c);
    if(r == 2 && c == 2 ){
      System.out.println(p);
      return;
    }
    solve(p+"R", r, c + 1);
    solve(p+"D", r + 1, c);
  }
} 