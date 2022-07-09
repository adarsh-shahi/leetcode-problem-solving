import java.util.*;
class solve {
    public static void main(String[] args) {
        for(int e: solve(new int[] {1024,512,256,128,64,32,16,8,4,2,1})) System.out.print(e + " ");
    }

    private static int[] solve(int[] arr){
      int[] bits = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        int j = 0;
        int count = 0;

        while(true){
         int current = 1 << j;
         
          if((arr[i] & current) == current){
            count++;
            sum += current;
          } 
          if(sum == arr[i]) {
            System.out.println(sum + " "  + count);
            break;
          }
          j++;
        }
        bits[i] = count;
      }
      for (int i = 0; i < bits.length - 1; i++) {
        for(int j = 0; j < bits.length - 1 - i; ++j){
          if(bits[j] > bits[j + 1]){
            int temp = bits[j];
            bits[j] = bits[j + 1];
            bits[j + 1] = temp;
            int temp1 = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp1;
          }
          else if(bits[j] == bits[j + 1] && arr[j] > arr[j + 1]){
            int temp1 = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp1;
          }
        }
        System.out.println(Arrays.toString(bits));
      }
     return arr;

    

    }
    
}
