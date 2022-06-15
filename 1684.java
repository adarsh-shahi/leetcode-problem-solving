import java.util.*;
class solve {
    public static void main(String[] args) {
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        String allowed = "cad";
        System.out.println(solve(allowed, words));

        
    }

    private static int solve(String allowed, String[] words){
        int count = 0;
        boolean flag = false;

        for(int i = 0; i < words.length; ++i){
            for(int j = 0; j < words[i].length(); ++j){
                flag = false;
                for(int k = 0; k < allowed.length(); k++){
                    if(words[i].charAt(j) == allowed.charAt(k)){
                        flag = true;
                        break;
                    }
                    
                    
                }
                if(!flag) break;
            }
            if(flag) count++;
            
        }
        return count;
    }
}

