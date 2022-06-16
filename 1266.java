// https://leetcode.com/problems/minimum-time-visiting-all-points/
import java.util.*;
class solve {
    public static void main(String[] args) {
        int[][] points = {
            {3,2},
            {-2,2},
           // {-1,0}
        };
        System.out.println(solve(points));
    }

    private static int solve(int[][] points){
        int time = 0;
        int disX = 0;
        int disY = 0;

        for(int i = 0 ; i < points.length - 1; ++i){
            disX = Math.abs(points[i][0] - points[i + 1][0]);
            disY = Math.abs(points[i][1] - points[i + 1][1]);
            time += Math.min(disX, disY) + Math.abs(disX-disY);
        }
        return time;
    }
    
}