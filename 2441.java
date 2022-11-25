import java.util.Arrays;

class leetocde{

    public static void main(String[]args){

        System.out.println(solve(new int[] {-1,10,6,7,-7,1}));
    }

    static int solve(int[] nums){
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < 0) return -1;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] > 0) break;
                else if(Math.abs(nums[j]) < nums[i]) break;
                else if(Math.abs(nums[j]) == nums[i]) return nums[i];
            }
        }
        return -1;
    }
}