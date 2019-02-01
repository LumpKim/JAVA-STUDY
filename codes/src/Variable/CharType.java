package Variable;

public class CharType {
    // char 형 변수의 사용: 유니코드 표현
    public static void main(String[] args) {
        char temp = 'A';        // 문자 그대로 초기화
        char temp2 = 65;        // 10진수로 초기화
        char temp3 = '\u0041';  // 16진수로 초기화

        char temp4 = '가';       // 문자 그대로 초기화
        char temp5 = 44032;     // 10진수로 초기화
        char temp6 = '\uac00';  // 16진수로 초기화

        // 유니코드 얻기!
        int unicode = temp;

        System.out.println(temp);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);
        System.out.println(temp5);
        System.out.println(temp6);
        System.out.println(unicode);
    }
}
