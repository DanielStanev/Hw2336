public class Hw4_Ex5 {
    public static void main(String[] x) {
        StackOfIntegers stack = new StackOfIntegers(60);

        for (int n = 1; n <= 120; n++)
            if (isPrime(n))
                stack.push(n);
        while (stack.getSize() != 0)
            System.out.println(stack.pop());
    }
    public static Boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
