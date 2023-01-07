package lambda;

// 매개변수가 있는 람다식
@FunctionalInterface
interface LambdaInterface2{
    void accept(int x); // 매개변수 있음
}
public class LambdaEx3 {
    public static void main(String[] args) throws Exception{
        LambdaInterface2 l2 = (x) -> {
            int result  = x * 5;
            System.out.println(result);
        };
        l2.accept(2);

        l2 = (x) -> System.out.println(x * 5);
        l2.accept(2);
    }
}
