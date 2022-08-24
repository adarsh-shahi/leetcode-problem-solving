class solve{
  public static void main(String[] args) {
    int[] arr = {2,3,5,9,14,16,18};
    System.out.println(floor(0, arr.length - 1, 17, arr));
  }

  static int solve(int s, int e, int t, int[] a){
    if(s > e) return -1;
    int mid = s + (e - s) / 2;
    if(a[mid] == t) return mid;
    else if(a[mid] > t) return solve(s, mid - 1, t, a); 
    else return solve(mid + 1, e, t, a);
  }


  // find ceil of target if not present
  static int ceil(int s, int e, int t, int[] a){
    if(s > e) return a[s];
    int mid = s + (e - s) / 2;
    if(a[mid] == t) return a[mid];
    else if(a[mid] > t) return ceil(s, mid - 1, t, a); 
    else return ceil(mid + 1, e, t, a);
  }

  // find floor of target if not present
  static int floor(int s, int e, int t, int[] a){
    if(s > e) return a[e];
    int mid = s + (e - s) / 2;
    if(a[mid] == t) return a[mid];
    else if(a[mid] > t) return floor(s, mid - 1, t, a); 
    else return floor(mid + 1, e, t, a);
  }
}