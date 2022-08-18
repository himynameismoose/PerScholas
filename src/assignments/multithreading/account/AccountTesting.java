package assignments.multithreading.account;

import static java.lang.Thread.sleep;

public class AccountTesting implements Runnable {

    private final Account account = new Account();

    public static void main(String[] args) {
        AccountTesting at = new AccountTesting();
        Thread reema = new Thread(at);
        Thread ranjeet = new Thread(at);
        reema.setName("Reema");
        ranjeet.setName("Ranjeet");
        reema.start();
        ranjeet.start();
    }

    private synchronized void withdraw(int amount) throws InterruptedException {

        String name = Thread.currentThread().getName();

        if (account.getBalance() >= amount) {
            System.out.println(name + " is going to withdraw");
            sleep(100);
            account.withdraw(amount);
            System.out.println(name + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for " + name);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                withdraw(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
