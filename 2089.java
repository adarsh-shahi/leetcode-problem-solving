// https://leetcode.com/problems/find-target-indices-after-sorting-array/
import java.util.*;
class solve {
    public static void main(String[] args) {
        solve();
    }

    private static List<Integer> solve(int[] nums, int target){
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) list.add(i);
        }
        return list;


    }
    
}