public class solve {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }

    static boolean isPowerOfTwo(int n){
        long s = 1; 
        for(int  i = 0; s <= n; i++){
            s = (long) Math.pow(2,i);
            if(s == n) return true;
        }
         return false;
    }
}
