import java.util.*;
class solve {
    public static void main(String[] args) {
        solve("","abc");
    }

    private static void solve(String p, String up){
      if(up.isEmpty()){
        System.out.println(p);
        return;
      }
      char f = up.charAt(0);
      for (int i = 0; i <= p.length(); i++) {
        solve(p.substring(0,i) + f + p.substring(i+1), up);
      }
      solve(p, up.substring(1));
    }
    
}
