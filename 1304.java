// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
import java.util.*;
class solve {
    public static void main(String[] args) {
        for(int e: solve(5)) System.out.println(e + " ");
    }

    private static int[] solve(int n){
        int[] output = new int[n];
        int sum = 0;
        for (int i = 0; i < output.length - 1; i++) {
            sum += i+1;
            output[i] = i+1;
        }
        output[n - 1] = -sum;

        return output;
    }
    
}