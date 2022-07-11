import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(solve(new int[] {3,8,-10,23,19,-4,-14,27}));
  }

  private static List<List<Integer>> solve(int[] arr) {
    List<List<Integer>> ans = new ArrayList<>();
    int minDiff = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if(minDiff > Math.abs(arr[i] - arr[j])){
          ans.clear();
          minDiff = Math.abs(arr[i] - arr[j]);
        }
        if(minDiff == Math.abs(arr[i] - arr[j])){
          List<Integer> point = new ArrayList<>();
          if(arr[i] > arr[j]){
            point.add(arr[j]);
            point.add(arr[i]);
          }
          else {
            point.add(arr[i]);
            point.add(arr[j]);
          }
          ans.add(point);
        }
      }
    }
    for (int i = 0; i < ans.size(); i++) {
      boolean isSorted = true;
      for (int j = 0; j < ans.size() - 1 - i; j++) {
        if(ans.get(j).get(0) > ans.get(j + 1).get(0)){
          isSorted = false;
          List<Integer> temp = ans.get(j);
          ans.set(j, ans.get(j + 1));
          ans.set(j + 1, temp);
        }
      }
      if(isSorted) return ans;
    }
    return ans;
  }
}
