import java.util.*;

class omkay {
  public static void main(String[] args) {
    System.out.println(minSetSize(new int[] { 3, 3, 3, 3, 5, 5, 5, 2, 2, 7 }));
  }

   static int minSetSize(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
        }
       
        
        int[] freq = new int[map.size()];
        int p = 0;
        for(int key: map.keySet()){
            freq[p++] = map.get(key);
        }
        
        Arrays.sort(freq);
        
        int c = arr.length;
        int s = 0;
     
        for(int i = freq.length - 1; i >= 0; i--){
            c -= freq[i];
            s++;
           
            if(c <= (arr.length / 2)) break;
        }
        return s;
  }
}