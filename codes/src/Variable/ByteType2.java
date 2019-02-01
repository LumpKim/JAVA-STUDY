package Variable;

public class ByteType2 {
    // 변수의 형태에 따른 차이 비교: byte 와 int
    public static void main(String[] args) {
        // 두 type 간 차이를 비교하기 위해 변수 선언
        byte temp = 125;
        int temp2 = 125;

        for (int i = 0; i < 5; i++) {
            temp++;
            temp2++;
            System.out.println("byte type: " + temp + "\t|\t" + "int type: " + temp2);
        }
    }
}
