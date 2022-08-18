package assignments.multithreading.account;

/**
 * 5. Create a class called Account that represents a bank account. This account starts with a
 *    balance of $50 and can be used only for withdrawals. The withdrawal will be accepted even if
 *    there isn't enough money in the account to cover it. The account simply reduces the balance by
 *    the amount you want to withdraw.
 *
 *    Imagine a couple, Ranjeet and Reema, who both have access to the account and want to make
 *    withdrawals. But they don't want the account to ever be overdrawn. Create a class
 *    AccountTesting that will start two threads and both thread trying to withdraw money from
 *    same account object in the loop. Withdrawal is two steps process:
 *
 *    1. Check the balance.
 *    2. If there's enough in the account (withdraw 10), make the withdrawal. Wait 100 before
 *       withdraw
 *
 *    Sample Output:
 *
 *    Reema is going to withdraw
 *    Reema completes the withdrawal
 *    Ranjeet is going to withdraw
 *    Ranjeet completes the withdrawal
 *    Ranjeet is going to withdraw
 *    Ranjeet completes the withdrawal
 *    Reema is going to withdraw
 *    Reema completes the withdrawal
 *    Reema is going to withdraw
 *    Reema completes the withdrawal
 *    Not enough in account for Reema to withdraw 0
 *    Not enough in account for Reema to withdraw 0
 *    Not enough in account for Ranjeet to withdraw 0
 *    Not enough in account for Ranjeet to withdraw 0
 *    Not enough in account for Ranjeet to withdraw 0
 */
public class Account {

    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
