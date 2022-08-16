import java.util.*;
class solve {
    public static void main(String[] args) {
        // solve("","abc");
        System.out.println(solve2("", "car"));
    }

    private static ArrayList<String> solve2(String p, String up){
      if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
      }
      char f = up.charAt(0);
      ArrayList<String> fl = new ArrayList<>();
      for (int i = 0; i <= p.length(); i++) {
        ArrayList<String> l = solve2(p.substring(0,i) + f + p.substring(i), up.substring(1));
        fl.addAll(l);
      }
      return fl;
  }

    private static void solve(String p, String up){
      if(up.isEmpty()){
          System.out.println(p);
          return;
      }
      char f = up.charAt(0);
      for (int i = 0; i <= p.length(); i++) {
          solve(p.substring(0,i) + f + p.substring(i), up.substring(1));
      }
  }
    
}
