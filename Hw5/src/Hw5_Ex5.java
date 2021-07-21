public class Hw5_Ex5 {
    public static void main(String[] x) {
        int index;
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter index of fibonacci number: ");
        index = input.nextInt();
        input.close();

        System.out.printf("The fibonacci number at index %d is %d", index, fib(index));
    }
    public static int fib(int n) {
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++)
            array[i] = array[i - 1] + array[i - 2];
        if (n <= 0)
            return 0; // no such thing as a 0th or negative fibonacci number
        return array[n - 1];
    }
}
