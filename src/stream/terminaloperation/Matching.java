package stream.terminaloperation;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Matching {
    public static void main(String[] args) {
        // int 형 배열 생성
        int[] arr = {2,7,10};

        // allMatch()
        boolean result1 = Arrays.stream(arr).allMatch(element -> element >= 1);
        System.out.println("모든 요소는 1보다 큰가?(true or false) : " + result1);

        // anyMatch()
        boolean result2 = Arrays.stream(arr).anyMatch(element -> element % 2 == 0);
        System.out.println("요소 중 하나라도 2의 배수가 있나?(true or false) : " + result2);

        // noneMatch()
        boolean result3 = Arrays.stream(arr).noneMatch(element -> element >= 10);
        System.out.println("모든 요소는 10 이상인가?(true or false : " + result3);

    }
}
