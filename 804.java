// https://leetcode.com/problems/unique-morse-code-words/
import java.util.*;
import java.math.BigInteger;
class solve {
    public static void main(String[] args) {
        String[] words = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        System.out.println(solve(words));
        
    }

    private static int solve(String[] words){
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morseWords = new String[words.length];
        String[] ASCIImorseWords = new String[words.length];
        int NUM = 31;

        for(int i = 0; i < words.length; i++){
            String morseStr = "";
            for(int k = 0; k < words[i].length(); ++k){
                morseStr += morseCode[((words[i].charAt(k) & NUM) - 1)];
            }
            morseWords[i] =  morseStr;
        }

        for(String e: morseWords) System.out.println(e);


        for(int i = 0; i < morseWords.length; ++i){
            String numericMorse = "";
            for(int k = 0; k  < morseWords[i].length(); ++k){
                numericMorse += String.valueOf((int)(morseWords[i].charAt(k)));
            }
            ASCIImorseWords[i] = numericMorse;
        }

        for(String e: ASCIImorseWords) System.out.println(e);

        BigInteger[] morseASCIIvalues = new BigInteger[words.length];

        for (int i = 0; i < morseASCIIvalues.length; i++) {
            morseASCIIvalues[i] =  new BigInteger(ASCIImorseWords[i]);
        }

        Arrays.sort(morseASCIIvalues);
        int count = 0;

        for(int i = 0; i < morseASCIIvalues.length - 1; ++i){
            int compareValue = morseASCIIvalues[i].compareTo(morseASCIIvalues[i + 1]);
            if(compareValue != 0) count++;
            
        }

        return count + 1;


    }
    
}