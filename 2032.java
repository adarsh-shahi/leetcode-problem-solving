import java.util.*;
class solve {
    public static void main(String[] args) {
      int[] nums1 = {1,1,3,2};
      int[] nums2 = {2,3};
      int[] nums3 = {3};
        for(Integer e: solve(nums1, nums2, nums3)) System.out.println(e + " ");
    }

    private static List<Integer> solve(int[] nums1, int[] nums2, int[] nums3){
        ArrayList<Integer> similar1and2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
          for (int j = 0; j < nums2.length; j++) {
            if(nums1[i] == nums2[j]) similar1and2.add(nums1[i]);
          }
        }

        ArrayList<Integer> similar2and3 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
          for (int j = 0; j < nums3.length; j++) {
            if(nums2[i] == nums3[j]) similar2and3.add(nums2[i]);
          }
        }

        ArrayList<Integer> similar1and3 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
          for (int j = 0; j < nums3.length; j++) {
            if(nums1[i] == nums3[j]) similar1and3.add(nums1[i]);
          }
        }

        ArrayList<Integer> similars = new ArrayList<>();
        similars.addAll(similar1and2);
        similars.addAll(similar2and3);
        similars.addAll(similar1and3);
        Collections.sort(similars);

        int min = Integer.MIN_VALUE;
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (int i = 0; i < similars.size(); i++) {
          if(similars.get(i) > min) {
            min = similars.get(i);
            noDuplicates.add(similars.get(i));
          }
        }

        return noDuplicates;
        
    }
    
}
