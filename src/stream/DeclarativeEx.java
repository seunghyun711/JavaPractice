package stream;

import java.util.List;

// 선언형 프로그래밍 방식
public class DeclarativeEx {
    public static void main(String[] args) {
        // 2의 배수의 합계 구하기
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);

        int sum =
                numbers.stream()
                        .filter(num -> num % 2== 0)
                        .mapToInt(num -> num)
                        .sum();
        System.out.println("선언형 프로그래밍 결과 : " + sum);
    }
}
