import java.util.*;

class omkay {
  public static void main(String[] args) {
 
    System.out.println(groupThePeople(new int[] {3,3,3,3,3,1,3}));
  }

   static List<List<Integer>> groupThePeople(int[] groupSizes) {
    List<List<Integer>> ans = new ArrayList<>();
     Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < groupSizes.length; i++){
        if(map.containsKey(groupSizes[i])) map.put(groupSizes[i], map.get(groupSizes[i]) + 1);
        else map.put(groupSizes[i], 1);
    }
    
    for(int key: map.keySet()){
        int b = map.get(key) / key;
        int c = key;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++){
          
            if(groupSizes[i] == key){
                list.add(i);
                c--;
            }
            if(c == 0){
                 b--;
                if(b != 0){
                 ans.add(list);
                list.clear();
                    c = key;
                }
                else {
                 ans.add(list);
                    break;
                }
            }
             
        }
        
    }
    
    return ans;
    
}
}