package stream.intermediate;

import java.util.Arrays;
import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        List<String> language = Arrays.asList("Java","Python","C","C++","Java");

        language.stream()
                .distinct() // 중복 제거
                .filter(element -> element.startsWith("C")) // C가 들어가는 요소만 추출
                .forEach(element -> System.out.println(element));
    }
}
