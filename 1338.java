import java.util.*;

class omkay {
  public static void main(String[] args) {
    System.out.println(minSetSize(new int[] { 3, 3, 3, 3, 5, 5, 5, 2, 2, 7 }));
  }

   static int minSetSize(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i]))
        map.put(arr[i], map.get(arr[i]) + 1);
      else
        map.put(arr[i], 1);
    }

    int s = 0;
    int c = arr.length;
    while (true) {
      int maxKey = 0;
      int maxValue = 0;
      for (int key : map.keySet()) {
        if (map.get(key) > maxValue) {
          maxKey = key;
          maxValue = map.get(key);
        }
      }
      map.remove(maxKey);
      c -= maxValue;
      s++;
      if (c <= (arr.length / 2))
        return s;
    }
  }
}