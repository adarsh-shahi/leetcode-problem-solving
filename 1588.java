// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
class solve {

    public static void main(String[] args) {
        int[] array = {10,11,12};
        System.out.println(solve(array));
    }

    private static int solve(int[] arr){

        int sum = 0;
        int limit = 0;

        for(int i = 0; i < arr.length; ++i){
            limit = i;
                for(int k = i; limit < arr.length; limit += 2){
                    for(int j = k; j <= limit; ++j){
                        sum += arr[j];
                    }
            }
        }
        return sum;
    }
}


