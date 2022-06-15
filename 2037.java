import java.util.*;
class solve {
    public static void main(String[] args) {
        int[] seats = {2,2,6,6};
        int[] students = {1,3,2,6};

        System.out.println(solve(seats, students));
        
    }

    private static int solve(int[] seats, int[] students){
        Arrays.sort(seats);
        Arrays.sort(students);
        int min = 0;

        for(int i = 0; i < seats.length; ++i){
            min += (Math.abs(seats[i] - students[i]));
        }

        return min;


    }
    
}