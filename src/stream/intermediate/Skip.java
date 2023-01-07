package stream.intermediate;

import java.util.stream.IntStream;

public class Skip {
    public static void main(String[] args) {
        // 1~10범위의 정수로 구성된 스트림 생성
        IntStream intStream1 = IntStream.range(1,10); // range(1,10)은 1부터 9까지 수를 요소로 가진다.
        IntStream intStream2 = IntStream.rangeClosed(1,10); // rangeClosed(1,10)은 1부터 10까지 수를 요소로 가진다.

        // 앞의 5개의 숫자를 건너 뛰고 6부터 출력
        intStream1.skip(5).forEach(System.out::println);
        intStream2.skip(5).forEach(System.out::println);
    }
}
