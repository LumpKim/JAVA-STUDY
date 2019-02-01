package Variable;

public class Variable2 {
    // 변수의 사용 가능한 범위를 알기 위한 예제
    public static void main(String[] args) {
        int temp = 10;

        // 제어문의 예를 들기 위해 조건문 사용
        if (temp > 5) {
            // int temp2 = temp + 3;
            // 10번 줄의 실행문을 실행하면 정수형 변수 temp2가 선언되는데, 이는 if 제어문 안에서만 동작한다.
            // 따라서 if 문 밖에서는 temp2가 선언되지 않은 것으로 처리된다.
        }

        // int result = temp + temp2;
        // 마찬가지로 temp2가 선언되어 있지 않으므로 15번째 줄의 연산을 수행할 수 없다.
    }
}
