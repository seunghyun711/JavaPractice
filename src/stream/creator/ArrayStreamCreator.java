package stream.creator;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 배열 스트림 생성
public class ArrayStreamCreator {
    public static void main(String[] args) {
        // Arrays.stream()으로 스트림 생성
        System.out.println("======= Arrays.stream() =======");
        // 문자열 배열 선언 및 할당
        String[] arr = new String[] {"hi","hello","bye"};

        // 문자열 스트림 생성
        Stream<String> stream1 = Arrays.stream(arr);

        // 출력
        stream1.forEach(System.out::println);

        // Stream.of()로 스트림 생성
        System.out.println("======= Stream.of() =======");
        // 문자열 배열 선언 및 할당
        String[] arr2 = new String[]{"hi", "hello", "bye"};

        // 문자열 스트림 생성
        Stream<String> stream2 = Stream.of(arr2);

        // 출력
        stream2.forEach(System.out::println);

        // IntStream 사용해보기
        // int형 배열을 스트림으로 생성
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7};
        IntStream intStream = Arrays.stream(intArr);

        // 숫자와 관련된 경우 IntStream사용 권장
        System.out.println("sum = " + intStream.sum());
//        System.out.println("average = " + intStream.average()); 38라인에서 스트림에 대한 최종연산이 완료되어 스트림이 닫히므로 해당 코드를 실행하려면 스트림을 새로 생성해야 한다.

    }
}
