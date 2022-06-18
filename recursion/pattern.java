package recursion;

import java.util.Arrays;

public class pattern {
    public static void main(String[] args) {
      //  patt(0, 4);
      int[] nums = {5,4,3,2,1};
      bubbleSort(nums, 0, 5);
      System.out.println(Arrays.toString(nums));
    }
    static void patt(int r, int c){

        if(c == 0) return;
       

        if(c > r){
            patt(++r, c);
            System.out.print("* ");
          
        }
        else{
            patt(0, --c);    
            System.out.println();  
        }
       


    }

    static void bubbleSort(int[] nums, int s, int l){

        

        if(l == 1) return;
        if(s == l - 1) bubbleSort(nums, 0, --l);
        else{
            if(nums[s] > nums[s + 1]){
                int temp = nums[s];
                nums[s] = nums[s + 1];
                nums[s + 1] = temp;
            }
            bubbleSort(nums, ++s, l); 
        }
       


    }

}
