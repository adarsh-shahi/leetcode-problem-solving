import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
      ArrayList<Integer> list = new ArrayList<>();
     while(true){ 
         int sum = 0;
      while(n > 0){
          int lastDigit = n % 10;
          sum += (lastDigit * lastDigit);
          n /= 10;
      }
         if(sum == 1) return true;
         
         if(list.contains(sum)) return false;
         else list.add(sum);
         n = sum;
         
         
     }
  }
    
}