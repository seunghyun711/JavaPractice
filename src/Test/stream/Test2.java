package Test.stream;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    public double getAverage(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        return list.stream()
                .mapToInt(e->e)
                .average() // average()는 OptionalDouble타입이므로 getAsDouble로 double형으로 변환한다.
                .getAsDouble();
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(t.getAverage(list));

    }
}
