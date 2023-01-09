package Test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
String타입을 요소로 가지는 List 2개를 입력받아 스트림으로 하나의 List로 만들기
 */
public class Test8 {
    public List<String> mergeStream(List<String> list1, List<String> list2) {
        // 방법 1 -> 리스트 두개 concat으로 합치기
        Stream<String> l1 = list1.stream();
        Stream<String> l2 = list2.stream();
        Stream<String> result = Stream.concat(l1, l2);

        return result.collect(Collectors.toList()); // List로 반환

    }

    public static void main(String[] args) {
        Test8 t = new Test8();

        List<String> list1 = Arrays.asList("Cantona", "Beckham");
        List<String> list2 = Arrays.asList("Ronaldo", "Owen");
        System.out.println(t.mergeStream(list1,list2));
    }
}
