package thread;

public class ThreadName {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());

            }
        });
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
