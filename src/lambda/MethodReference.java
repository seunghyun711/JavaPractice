package lambda;

import java.util.function.IntBinaryOperator;

class Calculator{
    public static int staticMethod(int x, int y) { // 정적 메서드
        return x + y;
    }
    public int InstanceMethod(int x, int y){ // 인스턴스 메서드
        return x + y;
    }
}
public class MethodReference {
    public static void main(String[] args) throws Exception{
        IntBinaryOperator operator;

        /*
        정적메서드 참조
        클래스 :: 메서드 이름
         */
        System.out.println("======= 정적 메서드 참조 =======");
        operator = Calculator :: staticMethod;
        System.out.println("정적 메서드 참조 결과 : " + operator.applyAsInt(10,1));
        System.out.println();

        /*
        인스턴스 메서드 참조
        참조 변수 :: 메서드 이름
         */
        System.out.println("======= 인스턴스 메서드 참조 =======");
        Calculator c = new Calculator();
        operator = c :: InstanceMethod;
        System.out.println("인스턴스 메서드 참조 결과 : " + operator.applyAsInt(10,1));

    }
}
