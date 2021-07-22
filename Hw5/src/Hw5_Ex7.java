public class Hw5_Ex7 {
    public static void main(String[] x) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a decimal number to conver to binary: ");
        System.out.print("The binary equivalent is: " + dec2Bin(input.nextInt()));
        input.close();
    }
    public static String dec2Bin(int n) {
        if (n <= 1)
            return "" + n;
        return dec2Bin(n/2) + (n % 2);
    }
}
