import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new String[] {"a","b","c","ab","bc","abc"}, "abc"));
    }

    private static int solve(String[] words, String s){
      int count = 0;
      for (int i = 0; i < words.length; i++) 
        if(s.startsWith(words[i])) count++;
      return count;
    }
    
}