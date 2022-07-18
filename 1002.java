import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new String[] {"cool","lock","cook"}));
    }

    private static List<String> solve(String[] nums){
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums[0].length(); i++) {
            boolean isSame = false;
            char ch = ' ';
            for (int j = 1; j < nums.length; j++) {
                isSame = false;
                for (int k = 0; k < nums[j].length(); k++) {
                    if(nums[0].charAt(i) == nums[j].charAt(k)){
                        isSame = true;
                        ch = nums[j].charAt(k);
                        nums[j] = nums[j].substring(0,k) + '1' + nums[j].substring(k+1);
                        break;
                    }
                }
                if(!isSame) break;
            }
            if(isSame) ans.add(String.valueOf(ch));
        }
        return ans;
    }
}
