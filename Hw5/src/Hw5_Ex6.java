public class Hw5_Ex6 {
    public static void main(String[] x) {
        java.util.Scanner input= new java.util.Scanner(System.in);

        System.out.print("Enter an integer: ");
        reverseDisplay(input.nextInt());
        input.close();
    }
    public static void reverseDisplay(int n) {
        String display = "";
        if (n == 0)
            System.out.print("0");
        if (n < 0) {
            display += '-';
            n *= -1;
        }
        while (n > 0) {
            display += (n % 10);
            n /= 10;
        }
        System.out.print(display);
    }
}
