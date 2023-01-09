package Test.stream;

import java.util.Arrays;

/*
String타입 배열 요소 중 문자열 길이가 가장 긴 것 리턴
 */
public class Test7 {
    public int logestLength(String[] arr) {
        if(arr.length == 0){
            return 0;
        }
        // 방법 1
//        return Arrays.stream(arr)
//                .mapToInt(String :: length)
//                .max()
//                .getAsInt();

        // 방법 2 -> reduce()사용
        return Arrays.stream(arr)
                .map(e->e.length())
                .reduce(0,(a,b)->a>b ? a : b); // reduce로 0부터 요소를 소모하면서 길이 비교
    }
    public static void main(String[] args) {
        String[] arr = {"hi","hello","GoodBye"};
        Test7 t = new Test7();
        System.out.println(t.logestLength(arr));


    }
}
