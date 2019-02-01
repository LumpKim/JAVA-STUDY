package Promotion;

public class OperationsPromotion {
    public static void main(String[] args) {
        byte byteTemp = 10;
        byte byteTemp2 = 20;
        // byte byteTemp3 = byteTemp + byteTemp2;   컴파일 에러 발생
        int intTemp1 = byteTemp + byteTemp2;
        System.out.println(intTemp1);

        char charTemp = 'A';
        char charTemp2 = 1;
        // char charTemp3 = charTemp1 + charTemp2;  컴파일 에러 발생
        int intTemp2 = charTemp + charTemp2;
        System.out.println("유니코드: " + intTemp2);
        System.out.println("출력문자: " + (char) intTemp2);

        int intTemp3 = 10;
        int intTemp4 = intTemp3 / 4;
        System.out.println(intTemp4);

        int intTemp5 = 10;
        // int intTemp6 = 10 / 4.0; 컴파일 에러 발생
        double doubleTemp = intTemp5 / 4.0;
        System.out.println(doubleTemp);
    }
}
