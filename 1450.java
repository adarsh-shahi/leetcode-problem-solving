// https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {4}, new int[] {4}, 4));
    }

    private static int solve(int[] startTime, int[] endTime, int queryTime){
        int count = 0;
        for (int i = 0; i < endTime.length; i++) {
            if(startTime[i] <= queryTime)
                if(endTime[i] >= queryTime)
                    count++;
        }
        return count;
    }
    
}