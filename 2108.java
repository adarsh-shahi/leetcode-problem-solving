// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

import java.util.*;

class solve {
    public static void main(String[] args) {
        String[] words = {
            "xngla","e","itrn","y","s","pfp","rfd"
        };
        System.out.println(solve(words));
    }

    private static String solve(String[] words){
        
        boolean isPalin = false;
        for (byte i = 0; i < words.length; i++) {
           
            int l = words[i].length() - 1;
            for(byte j = 0; j < words[i].length() / 2  + 1; j++, l--){
                if(words[i].charAt(j) == words[i].charAt(l)){
                    System.out.println(words[i]);
                    isPalin = true;
                }
                else { isPalin = false; break; };
            }
            if(isPalin) return words[i];
        }
        return "";

    }

}
