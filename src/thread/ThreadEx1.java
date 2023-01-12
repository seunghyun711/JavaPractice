package thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        // Runnable인터페이스 구현한 객체 생성
        Runnable runnable = new Task();

        // Runnable인터페이스를 구현한 객체를 인자로 전달하고, Thread클래스 인스턴스화하여 스레드를 생성
        Thread thread = new Thread(runnable);

        // 작업 스레드 실행, run()메서드 내의 내용을 실행
        thread.start();

        // 메인 스레드가 수행하는 코드
        for(int i = 0; i<50; i++){
            System.out.print(" <메인 스레드> ");
        }
    }
}

// Runnable인터페이스를 구현하는 클래스
class RunnableImpl implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<50; i++){
            System.out.print(" <작업 스레드> ");
        }
    }
}
