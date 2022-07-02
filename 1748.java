import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {4,1,3,4,6,6}));
            
    }

    private static int solve(int[] nums){
       int sum = 0;
       int[] array = new int[100];  

       for (int i = 0; i < nums.length; i++) {
         int data = array[nums[i]] + 1;
         array[nums[i]] = data;
       }


       for (int i = 0; i < array.length; i++) {
         if(array[i] == 1) sum+=i;
       }
 
       return sum;
    }



    } 
}
