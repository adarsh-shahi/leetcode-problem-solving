import java.util.*;
class solve {
    public static void main(String[] args) {
        // solve("","abc");
        System.out.println(solve3("", "car"));
    }

    private static int solve3(String p, String up){
      if(up.isEmpty()) return 1;
      int sum = 0;
      for (int i = 0; i <= p.length(); i++) {
        sum += solve3(p.substring(0,i) + up.charAt(0) + p.substring(i), up.substring(1));
      }
      return sum;
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
