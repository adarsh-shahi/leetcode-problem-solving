package bitwise;

public class findiBit {

    public static void main(String[] args) {
        System.out.println(set(11, 3));
    }

    static int find(int num, int i){
        // int mask =(int) Math.pow(2, i-1);
        int mask = 1 << i-1;
        if((num & mask) == 0) return 0;
        return 1;
    }


    static int set(int num, int i){
        // int mask =(int) Math.pow(2, i-1);
        int mask = 1 << i-1;
        return num | mask;
    }
} 