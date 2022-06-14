class solve {
    // https://leetcode.com/problems/create-target-array-in-the-given-order/
    // 0 <= index[i] <= i      -- thats why its easy
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0,1,4,2,1};
        for(int e: solve(index, nums)){
            System.out.println(e + " ");
        }
    }

    private static int[] solve(int[] index, int[] nums){
        int[] target = new int[index.length];

        for(int i = 0; i < target.length; ++i){
            target[i] = -1;
        }

        for(int i = 0; i < target.length; ++i){
            if(target[index[i]] == -1){
                target[index[i]] = nums[i];
            }
            else{
                for(int j = i; j > index[i]; j--){
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
            for(int e: target){
                System.out.print(e + " ");
            }
            System.out.println();
        }

        return target;

    }
    
}
