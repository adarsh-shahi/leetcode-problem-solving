import java.util.*;
class solve {
    public static void main(String[] args) {
      String[] s = {"a","b","c"};
        System.out.println(numOfStrings(s, "aaaaabbbbb"));
    }

     static int numOfStrings(String[] patterns, String word) {
      int count = 0;
        for (int i = 0; i < patterns.length; i++) {
          if(solve("", word, patterns[i])) count++;
        }
        return count;
    }

    private static boolean solve(String p, String up, String s){
      if(up.isEmpty()){
        if(s.equals(p)) return true;
        return false;
      }
      boolean flag = solve(p + up.charAt(0), up.substring(1), s);
      if(flag) return flag;  // if we find just avoid future recursive call
      boolean flag1 = solve(p, up.substring(1), s);
      if(flag1) return flag1; // if we find just avoid future recursive call
      return false;
    }
    
}
