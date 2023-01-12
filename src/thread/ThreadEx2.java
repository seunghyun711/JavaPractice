package thread;

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadExtends thread = new ThreadExtends();

        thread.start();

        // 메인 스레드 작업
        for (int i = 0; i < 50; i++) {
            System.out.print(" <메인 스레드> ");
        }


    }
}

class ThreadExtends extends Thread{
    public void run(){
        // 작업 스레드가 수행할 코드 작성
        for (int i = 0; i < 50; i++) {
            System.out.print(" <작업 스레드> ");
        }
    }
}