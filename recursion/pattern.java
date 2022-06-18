package recursion;

import java.util.Arrays;

public class pattern {
    public static void main(String[] args) {
      //  patt(0, 4);
      int[] nums = {5,4,3,2,1};
     // bubbleSort(nums, 0, 5);
     selectionSort(nums, 0, 5, Integer.MAX_VALUE);
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

    static void selectionSort(int[] nums, int s, int l, int min){

        if(l == 1) return;
        
        if(s == nums.length) {
            s = s-l+1;
            min = nums[s];
            selectionSort(nums, s, --l, min);
        }
        else{
            if(nums[s] < min){
                min = nums[s];
                int temp = nums[nums.length - l];
                nums[nums.length - l] = min;
                nums[s] = temp;
            }
            selectionSort(nums, ++s, l, min);
        }

        



    }

}
