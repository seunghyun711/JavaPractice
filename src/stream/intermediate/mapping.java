package stream.intermediate;

import java.util.Arrays;
import java.util.List;

public class mapping {
    public static void main(String[] args) {
        List<String> hello = Arrays.asList("hello","hi","goodbye");
        hello.stream()
                .map(element -> element.toUpperCase()) // 요소를 대문자로 변환
                .forEach(element -> System.out.println(element));
    }
}
