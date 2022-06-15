
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
import java.util.*;
class solve {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(solve(word1, word2));
            
    }

    private static boolean solve(String[] word1, String[] word2){ 
        String final1 = "";
        String final2 = "";

        for(int  i = 0; i < word1.length; i++)
            final1 += word1[i];

        for(int i = 0 ; i < word2.length; ++i)
            final2 += word2[i];

        return final1.equals(final2);
    }
    
}