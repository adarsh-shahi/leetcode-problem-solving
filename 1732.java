// https://leetcode.com/problems/find-the-highest-altitude/
import java.util.*;

import javax.security.auth.login.CredentialException;
class solve {
    public static void main(String[] args) {
        int[] gain = {
            -4,-3,-2,-1,4,3,2
        };
        System.out.println(solve(gain));
    }

    private static int solve(int[] gain){
        int current = 0;
        int max = current;
    
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if(current > max){
                max = current;
            }
        }

        return max;
    }
    
}