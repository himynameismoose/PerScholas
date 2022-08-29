package assignments.concurrency;

public class Concurrency implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) throws InterruptedException {
        // Start Thread
        Thread thread = new Thread(new Concurrency());
        System.out.println("Running thread 1a");
        thread.start();

        // Start 5 Threads
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new Concurrency());
            System.out.println("Running thread: " + t.getName());
            t.start();
        }
    }
}
