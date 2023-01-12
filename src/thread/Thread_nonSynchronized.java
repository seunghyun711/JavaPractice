package thread;

public class Thread_nonSynchronized {
    public static void main(String[] args) {
        Runnable threadTaskA = new Task();
        Runnable threadTaskB = new Task();

        Thread threadA = new Thread(threadTaskA);
        Thread threadB = new Thread(threadTaskB);

        threadA.setName("스레드A");
        threadB.setName("스레드B");

        threadA.start();
        threadB.start();

    }
}

class Calc{
    private int sum = 0;

    public int getSum() {
        return sum;
    }

    public int add(int number) {
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
        }
        return sum;
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        Calc c = new Calc();
        int result = c.add(2);

        System.out.println(Thread.currentThread().getName() + " : " + result);
    }
}