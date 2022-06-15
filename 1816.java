// https://leetcode.com/problems/truncate-sentence/
import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve("Hello how are you Contestant", 4));
    }

    private static String solve(String s, int k){
        StringBuilder finalStr = new StringBuilder();
        int spaceCount  = 0;

        for(int i = 0; i < s.length(); ++i){

            if(s.charAt(i) == ' '){
                spaceCount++;
            }
            if(spaceCount == k){
                return finalStr.toString();
            }
            finalStr.append(s.charAt(i));
        }


        return finalStr.toString();
        }
    
}