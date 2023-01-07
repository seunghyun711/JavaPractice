package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {

        // ArrayList 데이터
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("bye");

        // 배열
        String[] stringList = {"hi", "bye"};

        // ArrayList, String배열 스트림 생성 -> 모두 같은 방식으로 생성된다.
        Stream<String> listStream = arrayList.stream();
        Stream<String> arrayStream = Arrays.stream(stringList);

        // 출력
        System.out.println("ArrayList 데이터 출력");
        listStream.forEach(System.out::println);
        System.out.println();

        System.out.println("배열 데이터 출력");
        arrayStream.forEach(System.out::println);

    }

}
