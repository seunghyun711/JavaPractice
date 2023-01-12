package stream.practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream을 이용해 구구단 홀수단만 출력하기
public class OddTimesTable {
    public static void main(String[] args) {
        /*
        Stream을 이용해 2중 반복문을 구현한다.
        IntStream,rangeClosed(2,9)를 통해 단을 추출하고, IntStream.rangeClosed(2,9)를 통해 곱하는 수를 추출한다.
        이 두 개를 2중 반복문처럼 중첩하여 선언하면 된다.
         */
        System.out.println("======= 출력 결과 =======");

        IntStream.rangeClosed(2,9).filter(e->e%2 != 0)
                .forEach(e->{
                    IntStream.rangeClosed(1,9).forEach(i->{
                        System.out.println(e + " X " + i + " = " + e*i );
                    });
                });
    }
}
