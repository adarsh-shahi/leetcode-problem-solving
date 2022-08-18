package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

class solve{
  public static void main(String[] args) {
     System.out.println(solve3("",0,0));
  }
  /*
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
  */
  static ArrayList<String> solve3(String p, int r, int c){ // right , down and diagonal
    if(c >= 3 || r >= 3) return new ArrayList<>();
   
    if(r == 2 && c == 2 ) return new ArrayList<>(Arrays.asList(p));

    ArrayList<String> l1 = solve3(p+"R", r, c + 1);
    ArrayList<String> l2 = solve3(p+"D", r + 1, c);
    ArrayList<String> l3 = solve3(p+"X", r + 1, c + 1);
    l1.addAll(l2);
    l1.addAll(l3);
    return l1;
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