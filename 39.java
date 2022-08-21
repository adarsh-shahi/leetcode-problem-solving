import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[] {2,3,6,7}, 7));
    }
  
    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
      return recurse(0, target, new ArrayList<Integer>(),candidates);    
    }
    static List<List<Integer>> recurse(int i, int t, ArrayList<Integer> a, int[] c){
         if(i == c.length){
             List<List<Integer>> ti = new ArrayList<>();
             if(t == 0){
                 ti.add(a);
                 return ti;
             }
             return ti;
        }
          List<List<Integer>> all = new ArrayList<>();
         ArrayList<Integer> temp = new ArrayList<>();
         temp.addAll(a);

          ArrayList<Integer> o = new ArrayList<>();
         o.addAll(a);
         
         if(t-c[i] >= 0){
             o.add(c[i]);
           all.addAll(recurse(i,t-c[i], o ,c));
         }
         
          List<List<Integer>> m = new ArrayList<>();
              m.addAll(recurse(i+1,t,temp,c));
   
         all.addAll(m);
         return all;
     }
    
    
    
}