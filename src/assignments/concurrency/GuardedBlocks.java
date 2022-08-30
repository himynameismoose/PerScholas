package assignments.concurrency;

public class GuardedBlocks {
    private static int count = 0;

    public static void main(String[] args) {
        Runnable increment = () -> {
            while (count < 1000000) {
                count++;
            }
        };

        Thread t1 = new Thread(increment);
        t1.start();

        Runnable print = () -> {
            while (count < 1000000) {
                System.out.println(count);
            }
        };

        Thread t2 = new Thread(print);
        t2.start();
    }
}
