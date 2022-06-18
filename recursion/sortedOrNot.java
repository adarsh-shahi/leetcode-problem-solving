package recursion;

import java.util.ArrayList;

public class sortedOrNot {

    public static void main(String[] args) {
       System.out.println(findIndex(new int[] {1,2,3,4,5,2},2,0));
    
    }

    private static boolean solve(int[] nums,int p){
        if(p == nums.length - 1){
            return true;
        }
        if(nums[p] > nums[p+1]){
            return false;
        }
        return solve(nums, ++p);

     
        // if(nums[p] < nums[p+1]){
        //     return solve(nums, ++p); 
        // }
        // return false;
        
    }

    public static boolean part(int[] nums, int p) {
        if(p == nums.length - 1) return true;
        return nums[p] < nums[p+1] && solve(nums, ++p);        
    }

    static boolean find(int[] arr, int target, int p){
        if(p == arr.length) return false; 
        return arr[p] == target || find(arr, target, ++p);   
    }

  
    static ArrayList<Integer> findIndex(int[] arr, int target, int p){
        ArrayList<Integer> list = new ArrayList<>();
        if(p == arr.length) return list;
        if(arr[p] == target) list.add(p);
        ArrayList<Integer> adding = findIndex(arr, target, ++p);
        list.addAll(adding);
        return list;    
    }
   
}
