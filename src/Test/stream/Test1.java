package Test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Integer타입을 요소로 가지는 List를 입력받아 요소의 총 합 리턴하기
 */
public class Test1 {
    public int computeSumOfAllElements(List<Integer> list){
        return list.stream()
                .mapToInt(e -> e)
                .sum();
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(t.computeSumOfAllElements(list));

    }
}
