package Variable;

public class ByteType {
    // byte 형 변수의 사용: 변수가 담을 수 있는 값의 한계
    public static void main(String[] args) {
        // byte 형의 변수 선언
        byte temp = -127;
        byte temp2 = 0;
        byte temp3 = 127;

        // byte temp4 = 128;
        // byte 형의 변수는 -127에서 127 사이의 값만 저장할 수 있음!

        System.out.println(temp);
        System.out.println(temp2);
        System.out.println(temp3);
    }
}
