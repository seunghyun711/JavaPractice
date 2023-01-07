package stream.creator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamCreator {
    public static void main(String[] args) {
        // List에 요소들을 넣는다.
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7); // asList()는 배열을 List에 담아서 리턴하는 메서드
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);
    }
}
