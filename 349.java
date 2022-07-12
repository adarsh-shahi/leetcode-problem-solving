import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[] {4,9,5}, new int[] {9,4,9,8,4})));
    }

    private static int[] solve(int[] nums1, int[] nums2){
      HashMap<Integer, Integer> hashMap1 = new HashMap<>();
      for (int i = 0; i < nums1.length; i++) {
        if(hashMap1.containsKey(nums1[i])) hashMap1.put(nums1[i], hashMap1.get(nums1[i]) + 1);
        else hashMap1.put(nums1[i], 1);
      }

      HashMap<Integer, Integer> hashMap2 = new HashMap<>();
      for (int i = 0; i < nums2.length; i++) {
        if(hashMap2.containsKey(nums2[i])) hashMap2.put(nums2[i], hashMap2.get(nums2[i]) + 1);
        else hashMap2.put(nums2[i], 1);
      }

      ArrayList<Integer> list = new ArrayList<>();
      for (int key : hashMap1.keySet()) {
        if(hashMap2.containsKey(key)) list.add(key);
      }
      int[] ans = new int[list.size()];
      for (int i = 0; i < ans.length; i++) {
        ans[i] = list.get(i);
      }
     return ans;
    }
    
}
