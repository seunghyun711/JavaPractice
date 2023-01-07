package stream.intermediate;

import java.util.Arrays;
import java.util.List;

public class FlatMapping {
    public static void main(String[] args) {
        // 이중 배열 선언
        String[][] arr = new String[][]{{"Java","Python"},{"C","C++"}};

        Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
//                .forEach(names -> names.forEach(System.out::println)); 중첩 구조가 복잡해지면 코드도 복잡해지는 방식이다.
//                .forEach(System.out::println);// 배열의 스트림이 출력됨
    }
}
