package recursion;

public class basic {

    public static void main(String[] args) {

        // System.out.println(solve("adarsh shahi"));
        // System.out.println(solve2("app a day keeps applg away"));
        System.out.println(fibonacci(7));
        
    }

    static String solve(String word){  // skip a char

        String ans = "";

        if(word.length() == 0) return "";

        if(word.charAt(0) != 'a') ans += word.charAt(0); 

        return ans += solve(word.substring(1));
                    
    }

    static String solve2(String sentence){  // skips a string

        if(sentence.length() == 0) return "";

        if(sentence.startsWith("app") && !sentence.startsWith("apple")) // skips the words with app but not apple
            return solve2(sentence.substring(3));
        else 
            return sentence.charAt(0) + solve2(sentence.substring(1));

    }

    static int fibonacci(int n){
        if(n == 2 || n == 3) return 1;
        if(n == 1) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
     }

     
}
