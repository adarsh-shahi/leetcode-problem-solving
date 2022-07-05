
  import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,2,3}, new int[] {1,1,2,3}));
    }

    private static boolean solve(int[] target, int[] arr){
          
      Arrays.sort(target);
      Arrays.sort(arr);
      for(int  i = 0 ;i < arr.length; ++i){
        if(target[i] != arr[i]) return false;
      }
      // for (int i = 0; i < arr.length; i++) {
      //   boolean flag = false;
      //   for (int j = 0; j < target.length; j++) {
      //     if(arr[i] == target[j]) flag = true;
      //   }
      //   if(!flag) return false;
      // }

      // for (int i = 0; i < target.length; i++) {
      //   boolean flag = false;
      //   for (int j = 0; j < arr.length; j++) {
      //     if(arr[j] == target[i]) flag = true;
      //   }
      //   if(!flag) return false;
      // }

     return true;
    }
    
}

