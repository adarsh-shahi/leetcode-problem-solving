import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(skipString("isapplegood"));
    }

    private static String skipChar(String s){
      String ans = "";
      if(s.length() == 0) return ans;
      if(s.charAt(0) != 'a') ans += s.charAt(0);
      return ans + skipChar(s.substring(1));
    }


    static String skipString(String s){
      if(s.isEmpty()) return "";
      if(s.startsWith("apple"))
       return skipString(s.substring(5));
      return s.charAt(0) + skipString(s.substring(1));  
    }
    
}
