package recursion;

public class basic {

    public static void main(String[] args) {

        // System.out.println(solve("adarsh shahi"));
        System.out.println(solve2("app a day keeps applefg away"));
        
    }

    static String solve(String word){  // skip a char

        String ans = "";

        if(word.length() == 0) return "";

        if(word.charAt(0) != 'a') ans += word.charAt(0); 

        return ans += solve(word.substring(1));

    }

    static String solve2(String sentence){  // skips a string

        if(sentence.length() == 0) return "";

        if(sentence.startsWith("app") && !sentence.startsWith("apple")) 
            return solve2(sentence.substring(3));
        else 
            return sentence.charAt(0) + solve2(sentence.substring(1));

    }
    
}
