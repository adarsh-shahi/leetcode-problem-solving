import java.util.ArrayList;
// https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solve{
    public static void main(String[] args){
       int[] operations = {
        1,2,3,4
    };
      int[] ans = solve(operations);
      
      for(int e: ans){
        System.out.print(e + " ");
      }

    }

    private static  int[] solve(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i+=2){
            for(int j = 0; j < nums[i]; j++){
                list.add(nums[i+1]);
                
            }
            
        }

        int[] values = new int[list.size()];
        for (int i=0; i < values.length; i++)
            {
                values[i] = list.get(i).intValue();
        
            }


        return values;       
    }
}