import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    static boolean isSubsequence(String s, String t) {
       return solve("", t, s);
    }

    private static boolean solve(String p, String up, String s){
      if(up.isEmpty()) return s.equals(p) ? true : false;
     return solve(p + up.charAt(0), up.substring(1), s) || solve(p, up.substring(1), s);
    }
    
}
