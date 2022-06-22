package bitwise;

public class findUnique {

    public static void main(String[] args) {
        System.out.println(unique(new int[] {2,3,1,2,1,3,6,6,4}));
    }

    static int unique(int[] nums){
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) 
            num ^= nums[i];
        return num;
    }
}
