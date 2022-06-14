class solve {
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        for(int e : solve(encoded, 4)){
            System.out.println(e);
        }
    }
  private static int[] solve(int[] encoded, int first){
    int[] arr = new int[encoded.length + 1];
    arr[0] = first;

    for(int i = 1 ; i < arr.length; ++i){
        arr[i] = arr[i - 1] ^ encoded[i - 1];
    }

    return arr;
  }  
}
