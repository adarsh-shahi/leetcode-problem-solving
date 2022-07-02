import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve2(new int[] {5,1,5,2,5,3,5,4}));
    }

    private static int solve(int[] nums){
        int i = 0;
        while(i < nums.length){
          System.out.println(nums[i]);
          if((nums[i] != i) && (nums[nums[i]] != nums[i])){
              int temp = nums[i];
              nums[i] = nums[nums[i]];
              nums[nums[i]] = temp;
          }
          else ++i;
        }

        for (int j = 0; j < nums.length; j++) {
          if(nums[j] != j) return nums[j];
        }
        return -1;
    }

    static int solve2(int[] nums){
      int countReatpedNums = nums.length / 2;

      // ArrayList<Integer> arrayList = new ArrayList<>();
     

      // int max = 0;
      // for (int i = 1; i < nums.length; i++) {
      //   if(nums[i] > max) max = nums[i];
      // }
     
      int[] array = new int[10000];  

      for (int i = 0; i < nums.length; i++) {
        int data = array[nums[i]] + 1;
        array[nums[i]] = data;
      }

      for (int i = 0; i < 9; i++) {
        System.out.println(array[i]+ " ");
      }

      for (int i = 0; i < array.length; i++) {
        if(array[i] == countReatpedNums) return i;
      }

      return -1;

    }
}