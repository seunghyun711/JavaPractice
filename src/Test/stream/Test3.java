package Test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
요소 중 짝수만 추출하여 List로 리턴
 */
public class Test3 {
    public List<Integer> getOddNum(List<Integer> list) {
        return list.stream()
                .filter(e->e % 2==0)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        Test3 t = new Test3();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(t.getOddNum(list));

    }
}
