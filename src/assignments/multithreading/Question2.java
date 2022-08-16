package assignments.multithreading;

/**
 * 2. Write a program that starts three threads and each will take 1 second to print out
 *    each number from 1 - 5. However, the second and third thread must wait until the first thread
 *    finishes. Use sleep and join.
 *    Sample output:
 *    Thread[Thread-0,5,main]
 *    1
 *    2
 *    3
 *    4
 *    5
 *    Thread[Thread-1,5,main]
 *    Thread[Thread-2,5,main]
 *    1
 *    1
 *    2
 *    2
 *    3
 *    3
 *    4
 *    4
 *    5
 *    5
 */

public class Question2 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread());

        for (int i = 1; i <=5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Question2 t1 = new Question2();
        Question2 t2 = new Question2();
        Question2 t3 = new Question2();

        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
