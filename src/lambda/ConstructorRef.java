package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRef {
    public static void main(String[] args) {
        Function<String, Member> f1  = Member :: new; // 생성자 참조
        Member m1 = f1.apply("Hong"); // Member(String name)이 실행될 것이다.

        BiFunction<String, String, Member> f2 = Member :: new;
        Member m2 = f2.apply("Hong","hhh"); // Member(String name, String)가 실행될 것이다.
    }
}
