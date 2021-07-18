public class Hw4_Ex6 {
    public static void main(String[] x) {
        Boolean exit = false;
        int id, choice;
        double amount;
        Account[] array = new Account[10];
        java.util.Scanner input = new java.util.Scanner(System.in);


        for (int  i = 0; i < 10; i++)
            array[i] = new Account(i, 100, 0);

        while (true) {
            System.out.print("Enter ID: ");
            id = input.nextInt();

            if (id < 0 || id > 9) {
                System.out.print("Invalid ID\n\n");
                continue;
            }
            while (true) {
                System.out.print("\nMain Menu:\n");
                System.out.print("1 - view current balance\n");
                System.out.print("2 - withdraw\n");
                System.out.print("3 - deposit\n");
                System.out.print("4 - Exit\n");
                System.out.print("Enter Selection: ");

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("Balance: $%.2f\n", array[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount: $");
                        amount = input.nextDouble();
                        if (amount > array[id].getBalance())
                            System.out.print("There are not enough funds\n");
                        else
                            array[id].withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter amount: $");
                        amount = input.nextDouble();
                        array[id].deposit(amount);
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.print("Invalid Choice\n");
                        break;
                }
                if (exit)
                    break;
            }
            exit = false;
        }
    }
}
