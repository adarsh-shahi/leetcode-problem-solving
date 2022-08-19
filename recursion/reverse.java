import java.util.Arrays;

class soolve {
  public static void main(String[] args) {
    int[] a = {1,2,2,1};
    // solve(a, 5);
    System.out.println(solve1(a, 4));
  }

  static boolean solve1(int[] arr, int i){
    if(i == (arr.length / 2)) return true;
    return (arr[arr.length - i] == arr[i-1]) && solve1(arr, i - 1);
  }

  static void solve (int[] arr, int i){
    if(i == (arr.length / 2)) return;
    int temp = arr[arr.length - i];
    arr[arr.length - i] = arr[i - 1];
    arr[i - 1] = temp;
    solve(arr, i - 1);
  }
}