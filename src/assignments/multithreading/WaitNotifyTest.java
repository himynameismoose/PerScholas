package assignments.multithreading;

public class WaitNotifyTest {
    public static void main(String[] args) {
        Message message = new Message("process it");
        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "waiter").start();

        Waiter waiter2 = new Waiter(message);
        new Thread(waiter2, "waiter2").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "notifier").start();

        System.out.println("All the threads are started");
    }
}
