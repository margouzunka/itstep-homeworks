package homework4.task2;

public class Main {
    public static void main(String[] args) {
        BankAccount account1;
        account1 = new BankAccount();
        account1.accountNumber = 1;

        BankAccount account2;
        account2 = new BankAccount();
        account2.accountNumber = 2;

        System.out.println("Ложу 1000 на счет 1");
        account1.refillBalance(1000);
        account1.printBalance();

        System.out.println("Ложу 1000 на счет 2");
        account2.refillBalance(1000);
        account2.printBalance();

        System.out.println("Снимаю 200 со счета 1");
        account1.withdrawCash(200);
        account1.printBalance();

        System.out.println("Сниамю 350 со счета 2");
        account2.withdrawCash(350);
        account2.printBalance();
    }
}
