
  import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {3,7,9}, new int[] {3,7,11}));
    }

    private static boolean solve(int[] target, int[] arr){
          
     Map<Integer, Integer> targetMap = new HashMap<>();
     Map<Integer, Integer> arrMap = new HashMap<>();
     
     for (int i = 0; i < target.length; i++) {
      if(targetMap.containsKey(target[i])) targetMap.put(target[i], targetMap.get(target[i]) + 1);
      else targetMap.put(target[i], 1);
      if(arrMap.containsKey(arr[i])) arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
      else arrMap.put(arr[i], 1);
     }

    

     System.out.println(targetMap + " " + arrMap);

     for(int key: targetMap.keySet()){
      if(targetMap.get(key) == arrMap.get(key)) continue;
      else return false;
     }

     return true;
    }
    
}

