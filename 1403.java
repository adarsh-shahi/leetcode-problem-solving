import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {6}));
    }

    private static List<Integer> solve(int[] nums){
     List<Integer> subs = new ArrayList<>();
        int sum = 0;
     for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
     }

     int doNegativeIndex = -1;
     while(true){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
             max = nums[i];
             doNegativeIndex = i;
            }
        }
        nums[doNegativeIndex] = - nums[doNegativeIndex]; 
        subs.add(max);
        int subsSum = 0;
        for (int i = 0; i < subs.size(); i++) {
            subsSum += subs.get(i);
        }
        if(subsSum > (sum - subsSum)) return subs;
     }
    }
}
