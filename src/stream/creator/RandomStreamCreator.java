package stream.creator;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomStreamCreator {
    public static void main(String[] args) {

        // 난수 생성
        IntStream ints = new Random().ints(5); // 스트림 생성 범위를 5로 제한
//        IntStream ints = new Random().ints().limit(5);
        ints.forEach(System.out::println);
    }
}
