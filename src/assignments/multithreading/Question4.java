package assignments.multithreading;

/**
 * 4. Write a program that assigns priority to three threads(MIN_PRIORITY, NORM_PRIORITY,
 *    MAX_PRIORITY) and starts all thread. Each will take 2 seconds to print out the thread name, its
 *    priority and a line separator. This task will happen 3 times.
 *    Sample Output:
 *    running thread name is:Thread-2
 *    running thread priority is:5
 *    running thread name is:Thread-0
 *    running thread name is:Thread-1
 *    running thread priority is:10
 *    =======================================
 *    running thread priority is:1
 *    =======================================
 *    =======================================
 *    running thread name is:Thread-1
 *    running thread priority is:10
 *    =======================================
 *    running thread name is:Thread-0
 *    running thread name is:Thread-2
 *    running thread priority is:5
 *    =======================================
 *    running thread priority is:1
 *    =======================================
 *    running thread name is:Thread-1
 *    running thread priority is:10
 *    =======================================
 *    running thread name is:Thread-2
 *    running thread priority is:5
 *    =======================================
 *    running thread name is:Thread-0
 *    running thread priority is:1
 *    =======================================
 */
public class Question4 extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Question4();
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Question4();
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3 = new Question4();
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(2000);
                System.out.println("running thread name is:" + Thread.currentThread().getName());
                System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
                System.out.println("=======================================");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
