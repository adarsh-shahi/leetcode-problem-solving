import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new String[] {"d","b","c","b","c","a"}, 2));
    }

    private static String solve(String[] arr, int k){
      Map<String,Integer> map=new HashMap<>();
      for(String s:arr){
            
        if(map.containsKey(s)) map.put(s,map.get(s)+1);
        else map.put(s,1);
    }
    System.out.println(map);

      int c = 0;
      for (String word: arr) {
        if(map.get(word) == 1) c++;
        if(c == k) return word;
      }
      return "";
    }
}
