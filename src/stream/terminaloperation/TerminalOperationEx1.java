package stream.terminaloperation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TerminalOperationEx1 {
    public static void main(String[] args) {
        // int형 배열 선언
        int[] intArr = {1,2,3,4,5};

        // 카운팅
        long count = Arrays.stream(intArr).count();
        System.out.println("intArr 요소 개수 : " + count);

        // 합계
        long sum = Arrays.stream(intArr).sum();
        System.out.println("intArr 요소의 합 : " + sum);

        // 평균
        double avg = Arrays.stream(intArr).average().getAsDouble();
        System.out.println("intArr의 평균 : " + avg);

        // 최대값
        int max = Arrays.stream(intArr).max().getAsInt();
        System.out.println("intArr 요소의 최대 값 : " + max);

        // 최소값
        int min = Arrays.stream(intArr).min().getAsInt();
        System.out.println("intArr 요소의 최소값 : " + min);

        // 배열의 첫 번째 요소
        int first = Arrays.stream(intArr).findFirst().getAsInt();
        System.out.println("intArr 요소의 첫 번째 요소 : " + first);

    }
}
