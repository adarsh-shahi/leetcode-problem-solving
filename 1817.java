import java.util.*;

class omkay {
  public static void main(String[] args) {
    int[][] logs = {
      {0,5},
      {1,2},
      {0,2},
      {0,5},
        {1,3}
    };
    System.out.println(Arrays.toString(findingUsersActiveMinutes(logs, 5)));
  }

   static int[] findingUsersActiveMinutes(int[][] logs, int k) {
    List<List<Integer>> list = new ArrayList<>();
    for(int i = 0; i < logs.length; i++){
        list.add(new ArrayList<>(Arrays.asList(logs[i][0], logs[i][1])));
    }
    
    for(int i = 0; i < list.size() - 1; i++){
        for(int j = i + 1; j < list.size(); j++){
            
             if((Objects.equals(list.get(i).get(0), list.get(j).get(0))) && (Objects.equals(list.get(i).get(1), list.get(j).get(1)))){
                list.get(i).set(0,-1);
                list.get(i).set(1,-1);
              
            }
        }
    }
   
    
     Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < list.size(); i++){
        if(map.containsKey(list.get(i).get(0))) map.put(list.get(i).get(0), map.get(list.get(i).get(0)) + 1);
        else map.put(list.get(i).get(0), 1);
    }
    
    int[] ans = new int[k];
    
    for(int key: map.keySet()){
        if(key == -1) continue;
        if(ans[map.get(key) - 1] == 0) ans[map.get(key) - 1] = 1;
        else ans[map.get(key) - 1] = ans[map.get(key) - 1] + 1;
    }
    return ans;
}
}