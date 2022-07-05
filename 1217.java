import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {11}));
    }

    private static int solve(int[] position){
      boolean even = false;
      boolean odd = false;
      int firstOdd = Integer.MIN_VALUE;
      int firstEven = Integer.MIN_VALUE;
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for (int i = 0; i < position.length; i++) {
        if((position[i] & 1) == 1){ 
          odd = true;
          firstOdd = position[i];
        }
        else {
          even = true;
          firstEven = position[i];
        }
        int count = 0;
        for (int j = 0; j < position.length; j++) {
          if(position[i] == position[j]) count++;
        }
        hashMap.put(position[i], count);
      }

      if(even && !odd) return cost(hashMap, firstEven, false);
      else if(odd && !even) return cost(hashMap, firstOdd, true);
      else{
        int cost1 = cost(hashMap, firstEven, false);
        int cost2 = cost(hashMap, firstOdd, true);
        if(cost1 < cost2) return cost1;
        return cost2;
      }
      
    }

    static int cost(HashMap<Integer, Integer> hashMap, int minKey,boolean isOdd){
      int cost = 0;

        for(int key: hashMap.keySet()){
          if(minKey == key) continue;
  
         System.out.println(key + " " + hashMap.get(key));
          if(isOdd){
            if((key & 1) != 1) cost += hashMap.get(key);
          }
          else{
            if((key & 1) == 1) cost += hashMap.get(key);
        }
    }

    return cost;
  }
}
