package Promotion;

public class AutoPromotion {
    public static void main(String[] args) {
        byte byteTemp = 10;
        int intTemp = byteTemp;     // byte -> int
        System.out.println(intTemp);

        char charTemp = '가';
        intTemp = charTemp;         // char -> int
        System.out.println("'가'의 유니코드 = " + intTemp);

        intTemp = 500;
        long longTemp = intTemp;    // int -> long
        System.out.println(longTemp);

        intTemp = 200;
        double doubleTemp = intTemp;    // int -> double
        System.out.println(doubleTemp);
    }
}
