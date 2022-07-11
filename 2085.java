import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(
        solve(new String[] {"a","ab"}, new String[] {"a","a","a","ab"}));
  }

  private static int solve(String[] words1, String[] words2) {
    HashMap<String, Integer> hashMap1 = new HashMap<>();
    for (int i = 0; i < words1.length; i++) {
      if (hashMap1.containsKey(words1[i]))
        hashMap1.put(words1[i], hashMap1.get(words1[i]) + 1);
      else
        hashMap1.put(words1[i], 1);
    }

    HashMap<String, Integer> hashMap2 = new HashMap<>();
    for (int i = 0; i < words2.length; i++) {
      if (hashMap2.containsKey(words2[i]))
        hashMap2.put(words2[i], hashMap2.get(words2[i]) + 1);
      else
        hashMap2.put(words2[i], 1);
    }

    int count = 0;

    for (String key : hashMap1.keySet()) {
      if (hashMap1.get(key) == 1 && hashMap2.containsKey(key) && hashMap2.get(key) == 1)
        count++;
    }
    return count;
  }
}
