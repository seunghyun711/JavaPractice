package stream.terminaloperation;

import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // sum()
        long sum = Arrays.stream(arr).sum();
        System.out.println("모든 arr 요소의 합 : " + sum);

        // 초기값 없는 reduce()
        long sum1 = Arrays.stream(arr)
                .map(element -> element*2)
                .reduce((a,b) -> a + b)
                .getAsInt();
        System.out.println("초기값 없는 reduce() 결과 : " + sum1);

        // 초기값 있는 reduce()
        long sum2 = Arrays.stream(arr)
                .map(element -> element * 2)
                .reduce(5,(a,b) -> a + b);
        System.out.println("초기값 있는 reduce() 결과 + " + sum2);
    }
}
