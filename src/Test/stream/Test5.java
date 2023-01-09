package Test.stream;

import java.util.Arrays;
import java.util.List;

/*
* String타입을 요소로 가지는 List를 입력받아서 중복제거,정렬 후 String 타입을 요소로 가지는 배열 리턴하기
 */
public class Test5 {
    public String[] ListToString(List<String> names) {
        return names.stream()
                .distinct()
                .sorted()
                .toArray(String[] :: new); // String배열로 반환
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        List<String> list = Arrays.asList("Cantona","Beckham","Rooney");
        String[] result = t.ListToString(list);
        System.out.println(result);

    }
}
