package recursion;

import java.util.ArrayList;

public class subsets {

    public static void main(String[] args) {
        System.out.println((solve("car", "")));
    }

    static ArrayList<String> solve(String word, String ans){
       
        if(word.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
		}
		char ch = word.charAt(0);
        ArrayList<String> left =solve(word.substring(1),ans + ch); 
        ArrayList<String> right = solve(word.substring(1),ans);
        left.addAll(right);
		return left;
    }
    
}
