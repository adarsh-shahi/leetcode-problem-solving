import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(64));
    }

    private static boolean solve(int n){
      long s = 1; 
      for(int  i = 0; s <= n; i++){
          s = (long) Math.pow(4,i);
          if(s == n) return true;
      }
       return false;
    }
    
}