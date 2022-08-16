package assignments.multithreading;

/**
 * 3. Repeat the work done in question 2, however, this time give name to each thread.
 *    Sample output:
 *    Thread[My First Thread,5,main]
 *    1
 *    2
 *    3
 *    4
 *    5
 *    Thread[My Third Thread,5,main]
 *    Thread[My Second Thread,5,main]
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
public class Question3 extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Question3 t1 = new Question3();
        Question3 t2 = new Question3();
        Question3 t3 = new Question3();

        t1.setName("My First Thread");
        t2.setName("My Second Thread");
        t3.setName("My Third Thread");

        t1.start();
        t1.join();
        t3.start();
        t2.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
