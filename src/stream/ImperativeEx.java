package stream;

import java.util.List;

// 명령형 프로그래밍 방식
public class ImperativeEx {
    public static void main(String[] args) {
        // List에 있는 숫자들 중 2의 배수의 합계 출력
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        int sum = 0;

        for(int num : numbers){
            if(num %2 == 0){
                sum += num;
            }
        }
        System.out.println("명령형 프로그래밍 결과 : " + sum);
    }

}
