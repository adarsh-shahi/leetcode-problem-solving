package recursion;

import java.util.ArrayList;

public class subsets {

    public static void main(String[] args) {
        subsets("", "car");
    }

    static void subsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subsets(p + up.charAt(0), up.substring(1));
        subsets(p, up.substring(1));
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
