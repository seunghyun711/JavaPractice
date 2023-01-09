package Test.stream;

import java.util.Arrays;

/*
int 배열 요소 중 가장 큰 요소 리턴
 */
public class Test6 {
    public Integer returnBigNum(int[] arr) {
        if (arr.length == 0) {
            return null; // 배열에 아무것도 없을 때 null 리턴
        }
        return Arrays.stream(arr)
                .max()
                .getAsInt(); // max()는 OptionalInt형이므로 int형으로 변환하여 리턴한다.
    }
    public static void main(String[] args) {
        Test6 t = new Test6();
        int[] arr = {1, 10, 5, 32, 5};
        Integer output = t.returnBigNum(arr);
        System.out.println(output);

    }
}
