import java.util.*;
// https://leetcode.com/problems/count-good-triplets/
class solve {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println(solve(arr, 0, 0, 1));
        
    }

    private static int solve(int[] arr, int a, int b, int c){
        int goodPairs = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for(int k = i + 2; k < arr.length; k++){
                for(int j = i + 1; j < k; j++){
                    if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        goodPairs++;
                    }
                }
            }
        }

        return goodPairs;
    }
    
}
