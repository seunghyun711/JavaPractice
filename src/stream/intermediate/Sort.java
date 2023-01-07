package stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sort {
    public static void main(String[] args) {
        // 리스트
        List<String> names = Arrays.asList("hong","kim","choi","min","park");

        // sorted() 사용
        names.stream()
                .sorted().forEach(System.out::println); // sorted()에 아무인자도 없기 때문에 오름차순으로 정렬된다.

        // sorted(Comparator.reverseOrder()) 사용
        names.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println); // sorted()에 아무인자도 없기 때문에 오름차순으로 정렬된다.
    }
}
