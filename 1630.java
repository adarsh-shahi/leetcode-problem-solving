import java.util.*;

class omkay {
  public static void main(String[] args) {
    System.out.println(checkArithmeticSubarrays(new int[] {4,6,5,9,3,7}, new int[] {0,0,2},new int[] {2,3,5}));
  }

   static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    List<Boolean> a = new ArrayList<>();
    for(int i = 0; i < l.length; i++){
        int[] temp = new int[r[i] - l[i] + 1];
        int p = 0;
        for(int j = l[i] ; j <= r[i]; j++){
            temp[p++] = nums[j];
        }
        Arrays.sort(temp);
        int d = temp[1] - temp[0];
        boolean isValid = true;
        for(int j = 0; j < temp.length - 1; j++){
            if(temp[j+1] - temp[j] != d){
                a.add(false);
                isValid = false;
                break;
            }
        }
        if(isValid) a.add(true);
    }
    return a;
}
}