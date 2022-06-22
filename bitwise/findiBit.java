package bitwise;

public class findiBit {

    public static void main(String[] args) {
        System.out.println(find(7, 3));
    }

    static int find(int num, int i){
        // int mask =(int) Math.pow(2, i-1);
        int mask = 1 << i-1;
        if((num & mask) == 0) return 0;
        return 1;
    }
} 