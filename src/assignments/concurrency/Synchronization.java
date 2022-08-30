package assignments.concurrency;

public class Synchronization implements Runnable{
    private static int counter;

    public synchronized void incrementCount() {
        counter++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Synchronization());
        Thread t2 = new Thread(new Synchronization());
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000000; i++) {
            incrementCount();
        }

        System.out.println(counter);
    }
}
