import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("isappgood"));
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

    static String skipAppNotApple(String s){
      if(s.isEmpty()) return "";
      if(s.startsWith("app") && !s.startsWith("apple"))
       return skipAppNotApple(s.substring(3));
      return s.charAt(0) + skipAppNotApple(s.substring(1));  
    }
    
}
