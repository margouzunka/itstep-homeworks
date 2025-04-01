package homework4.task2;

public class BankAccount {
    int accountNumber;
    int accountBalance;

    public void refillBalance(int a) {
        accountBalance = accountBalance + a;
    }
    public void withdrawCash(int a) {
        accountBalance = accountBalance - a;
    }
    public void printBalance() {
        int i;
        System.out.println("На счету " + accountNumber + " баланс " + accountBalance);
        System.out.println();
    }
}
