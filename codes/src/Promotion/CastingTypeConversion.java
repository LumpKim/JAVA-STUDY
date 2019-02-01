package Promotion;

public class CastingTypeConversion {
    public static void main(String[] args) {
        int intTemp = 44032;
        char charTemp = (char) intTemp;
        System.out.println(charTemp);

        long longTemp = 500;
        intTemp = (int) longTemp;
        System.out.println(intTemp);

        double doubleTemp = 3.14;
        intTemp = (int) doubleTemp;
        System.out.println(intTemp);
    }
}
