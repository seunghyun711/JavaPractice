package lambda;

@FunctionalInterface // 컴파일러가 인터페이스가 올바르게 정의되었는지 확인하게 한다.
interface ExFunction{ // 함수형 인터페이스 선언
    int sum(int x, int y);
}
public class LambdaEx1 {
    public static void main(String[] args) {
        ExFunction exFunction = (x,y) -> x + y;
        System.out.println(exFunction.sum(10,7));

    }
}
