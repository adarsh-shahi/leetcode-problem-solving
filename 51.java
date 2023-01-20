import java.util.ArrayList;
import java.util.List;

class okay {
  public static void main(String[] args) {
    int n = 6 ;
    List<List<Integer>> ok = queen(n, new ArrayList<Integer>());
    List<List<String>> finalAns = new ArrayList<>();
    for (int i = 0; i < ok.size(); i++) {
      List<String> temp = new ArrayList<>();
      for (int j = 0; j < ok.get(i).size(); j++) {
        String t = "";

        t += '"';
        for (int k = 0; k < ok.get(i).size(); k++) {
          if (ok.get(i).get(j) == k) {

            t += "Q";
          } else {
            t += ".";

          }

        }
        t += '"';
        temp.add(t);
      }
      finalAns.add(temp);
    }
    System.out.println(finalAns);
  }

  static List<List<Integer>> queen(int n, ArrayList<Integer> p) {
    List<List<Integer>> sum = new ArrayList<>();
    if (n == p.size()) {
      ArrayList<Integer> temp = new ArrayList<>();
      temp.addAll(p);
      sum.add(temp);
      return sum;
    }
    List<List<Integer>> ans = new ArrayList<>();
    boolean flag = p.size() > 1 ? true : false;
    boolean fallback = false;
    for (int i = 0; i < n; i++) {
      if (!p.contains(i)) {
        if ((p.size() > 0 ? Math.abs(p.get(p.size() - 1) - i) != 1 : i != -1)) {
          if (flag) {
            for (int j = 0; j < p.size() - 1; j++) {
              if (Math.abs(p.size() - j) == Math.abs(p.get(j) - i)) {
                fallback = true;
                break;
              }
            }
          }
          if (fallback) {
            fallback = false;
            continue;
          }
          p.add(i);
          // System.out.println(p);
          ans.addAll(queen(n, p));
          p.remove(p.size() - 1);
        }
      }
    }
    return ans;
  }
}