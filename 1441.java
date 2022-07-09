import java.util.*;
class solve {
    public static void main(String[] args) {
      System.out.println(solve(new int[] {1,3}, 3));
    }

    private static List<String> solve(int[] target, int n){
      List<String> list = new ArrayList<>();
      int count = 1;
      for (int i = 0; i < target.length;) {
        if(target[i] == count){
          list.add("Push");
          i++;
        }
        else{
          list.add("Push");
          list.add("Pop");
        }
        count++;
      }
     return list;
    }
    
}