import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,3,3}, new int[] {1,1,2,2}));
    }

    private static List<List<Integer>> solve(int[] nums1, int[] nums2){
      HashSet<Integer> hashSet1 = new HashSet<>();
      for (int e : nums1) {
        hashSet1.add(e);
      }
      HashSet<Integer> hashSet2 = new HashSet<>();
      for (int e : nums2) {
        hashSet2.add(e);
      }
      List<List<Integer>> list = new ArrayList<>();

      List<Integer> all1 = new ArrayList<>();
      for (int e : hashSet1) {
        if(!hashSet2.contains(e)) all1.add(e);
      }

      List<Integer> all2 = new ArrayList<>();
      for (int e : hashSet2) {
        if(!hashSet1.contains(e)) all2.add(e);
      }

      list.add(all1);
      list.add(all2);
     return list;
    }
    
}
