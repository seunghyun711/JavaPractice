package lambda;

// 매개변수와 리턴값이 없는 람다식

@FunctionalInterface
interface LambdaInterface1{
    void accept();
}
public class LambdaEx2 {
    public static void main(String[] args) {
        LambdaInterface1 l = () -> {
            System.out.println("accept() 호출");
        };
        l.accept();

    }
}
