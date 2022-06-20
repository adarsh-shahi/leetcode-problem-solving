package recursion;

public class basic {

    public static void main(String[] args) {

        System.out.println(solve("adarsh", 0));
        
    }

    static String solve(String word, int p){

        String ans = "";

        if(p == word.length()) return "";

        if(word.charAt(p) != 'a') ans += word.charAt(p); 

        return ans += solve(word, ++p);


    }
    
}
