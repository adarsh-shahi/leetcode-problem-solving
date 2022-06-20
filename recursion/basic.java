package recursion;

public class basic {

    public static void main(String[] args) {

        System.out.println(solve("adarsh"));
        
    }

    static String solve(String word){

        String ans = "";

        if(word.length() == 0) return "";

        if(word.charAt(0) != 'a') ans += word.charAt(0); 

        return ans += solve(word.substring(1));


    }
    
}
