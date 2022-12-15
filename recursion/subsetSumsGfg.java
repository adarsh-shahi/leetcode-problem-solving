package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subsetSumsGfg {
  public static void main(String[] args) {
    System.out.println(subsetSums(new ArrayList<>(Arrays.asList(3,1,2)), 0, new ArrayList<>(), 3));

  }

  static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int p, ArrayList<Integer> pick, int N) {
    ArrayList<Integer> ans = new ArrayList<>();
    if (arr.size() == 0) {
      System.out.println(pick);
      int sum = 0;
      for (Integer e : pick) {
        sum += e;
      }
      ans.add(sum);
      return ans;
    }
    ArrayList<Integer> copy = new ArrayList<>();
    for (int i = 1; i < arr.size(); i++) {
      copy.add(arr.get(i));
    }
    ans.addAll(subsetSums(copy, p, pick, N));

    pick.add(arr.get(0));
    ans.addAll(subsetSums(arr, p, pick, N));
    return ans;
  }
}