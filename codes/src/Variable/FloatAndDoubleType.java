package Variable;

public class FloatAndDoubleType {
    public static void main(String[] args) {
        double temp = 3.14;
        // float temp2 = 3.14;  컴파일 오류
        float temp3 = 3.14F;
        // float 형 변수를 초기화할 때에는 마지막에 F를 붙

        // 소수점 비교
        double temp4 = 0.1234567890123456789;
        float temp5 = 0.1234567890123456789F;

        System.out.println("temp: " + temp);
        System.out.println("temp3: " + temp3);
        System.out.println("temp4: " + temp4);
        System.out.println("temp5: " + temp5);

        // e 사용
        int temp6 = 3000000;
        double temp7 = 3e6;
        float temp8 = 3e6F;
        double temp9 = 2e-3;

        System.out.println("temp6: " + temp6);
        System.out.println("temp7: " + temp7);
        System.out.println("temp8: " + temp8);
        System.out.println("temp9: " + temp9);
    }
}
