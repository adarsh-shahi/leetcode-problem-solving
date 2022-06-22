package bitwise;

public class isOddEven {

    public static void main(String[] args) {
        System.out.println(evenOdd(90));
    }

    static String evenOdd(int num){
        if((num & 1) == 0) return "even";
        return "odd";
    }
}
