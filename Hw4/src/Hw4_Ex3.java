public class Hw4_Ex3 {
    public static void main(String[] x) {
        Account a1 = new Account(1122, 20000, 4.5);

        a1.withdraw(2500);
        a1.deposit(3000);

        System.out.print("Account 1: \n");
        System.out.printf("Balance:          $%.2f\n", a1.getBalance());
        System.out.printf("Monthly Interest: $%.2f\n", a1.getMonthlyInterest());
        System.out.print("Date Created: " + a1.getDateCreated());
    }
}
