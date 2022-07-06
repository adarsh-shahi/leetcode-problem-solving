import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
    }

    private static boolean solve(int[] arr){
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
        if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
        else map.put(arr[i], 1);
      }

      for(int key: map.keySet()){
        for(int checkKey: map.keySet()){
          if(key != checkKey && map.get(key) == map.get(checkKey)) return false;
        }
      }

     return true;
    }
    
}
