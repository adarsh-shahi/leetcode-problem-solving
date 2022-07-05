import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {2, 3,3}));
    }

    private static int solve(int[] position){
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for (int i = 0; i < position.length; i++) {
        int count = 0;
        for (int j = 0; j < position.length; j++) {
          if(position[i] == position[j]) count++;
        }
        hashMap.put(position[i], count);
      }

      int cost = Integer.MAX_VALUE;

      for (int currentKey: hashMap.keySet()) {
        int currentCost = 0;
        int minKey = currentKey;
  
        boolean isOdd = (minKey & 1) == 1;
        
        for(int key: hashMap.keySet()){
          if(minKey == key) continue;
  
         System.out.println(key + " " + hashMap.get(key));
          if(isOdd){
            if((key & 1) != 1) currentCost += hashMap.get(key);
          }
          else{
            if((key & 1) == 1) currentCost += hashMap.get(key);
          }
        }
        System.out.println("current cost" + currentCost);

        if(cost > currentCost) cost = currentCost;
        
      }
      return cost;
    }
    
}
