package lambda;

// 리턴값이 있는 람다식
@FunctionalInterface
interface LambdaInterface4{
    int accept(int x, int y);
}
public class LambdaEx4 {
    public static void main(String[] args) throws Exception{
        LambdaInterface4 l4;

        l4 = (x,y) -> {
            int result = x + y;
            return result; // 함수형 인터페이스의 메서드의 리턴타입과 동일한 리턴타입으로 리턴해줘야 한다.
        };
        int result1 = l4.accept(2, 5);
        System.out.println(result1);

        l4 = (x,y) -> {return x + y;};
        int result2 = l4.accept(2, 5);
        System.out.println(result2);

        l4 = (x,y) -> x + y; // return문만 있을 경우 {}와 return문 생략가능
        int result3 = l4.accept(2, 5);
        System.out.println(result3);

        l4 = (x,y) -> sum(x,y); // sum()호출
        int result4 = l4.accept(2, 5);
        System.out.println(result4);

    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
