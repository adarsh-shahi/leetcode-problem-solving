package recursion;

import java.util.ArrayList;

public class subsets {

    public static void main(String[] args) {
    //    System.out.println(subsets("", "car"));
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        ArrayList<Integer> a = new ArrayList<>();

    // subsequences(a,b);
    int[] ab = {1,2,3};
    subsequences2(0, ab, a);

    }


    static void subsequences2(int i, int[] a, ArrayList<Integer> ans){
        if(i == a.length){
            System.out.println(ans);
            return;
        }
        ArrayList<Integer> t = new ArrayList<>();
        for(int e: ans) t.add(e);
        ans.add(a[i]);
        subsequences2(i + 1, a, ans);
        
        subsequences2(i + 1, a, t);
    }

    static ArrayList<String> subsets(String p, String up){
        
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> l1 = subsets(p + up.charAt(0), up.substring(1));
        ArrayList<String> l2 = subsets(p, up.substring(1));
        l1.addAll(l2);
        return l1;
    }

    static void subsequences(ArrayList<Integer> a, ArrayList<Integer> b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for(int e: a) temp.add(e);
        a.add(b.get(0));
        ArrayList<Integer> temp2 = new ArrayList<>();
        for(int i = 1; i < b.size(); i++){
            temp2.add(b.get(i));
        }
        subsequences(a, temp2);
        subsequences(temp, temp2);

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
