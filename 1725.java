// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
import java.util.*;
class solve {
    public static void main(String[] args) {
        int[][] rect = {
            {2,3},
            {3,7},
            {4,3},
            {3,7}
        };
        System.out.println(solve(rect));
    }

    private static int solve(int[][] rectangles){
        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < rectangles.length; i++) {
            int currentMin = Math.min(rectangles[i][0], rectangles[i][1]);
            if(currentMin > maxLen) {
                maxLen = currentMin;
                count = 1;
            }
            else if(currentMin == maxLen) count++; 
        }

        return count;
    }
    
}