import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(234));
    }

    private static int solve(int n){
      return recurse(0,1,n);
    }
    
    static int recurse(int sum, int product, int n){
        if(n == 0) return product - sum;
        int lastDigit = n % 10;
        return recurse(sum + lastDigit, product * lastDigit,  n / 10);
    }
    
}
