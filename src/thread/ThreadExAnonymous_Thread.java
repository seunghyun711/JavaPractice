package thread;

public class ThreadExAnonymous_Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                for(int i = 0; i<50; i++){
                    System.out.print(" <작업 스레드> ");
                }
            }
        };
        thread.start();

        // 메인 스레드 작업
        for(int i = 0; i<50; i++){
            System.out.print(" <메인 스레드> ");
        }
    }
}
