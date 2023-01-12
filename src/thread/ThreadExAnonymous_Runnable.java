package thread;

public class ThreadExAnonymous_Runnable {
    public static void main(String[] args) {
        // Runnable 구현 객체를 익명 객체로 선언
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.print(" <작업 스레드> ");
                }
            }
        });

        thread.start();

        // 메인 스레드 코드
        for (int i = 0; i < 50; i++) {
            System.out.print(" <메인 스레드> ");
        }
    }
}
