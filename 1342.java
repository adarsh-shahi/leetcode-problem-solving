import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    private static int numberOfSteps(int num){
      if(num == 0) return 0;
      int count = 0;
          if((num & 1) == 1){
              count++;
           count += numberOfSteps(num - 1);
          }
      else {
          count++;
            count += numberOfSteps(num / 2);
      }
      return count;
    }
    
}