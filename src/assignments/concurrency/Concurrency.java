package assignments.concurrency;

public class Concurrency implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Concurrency());
        t.start();
    }
}
