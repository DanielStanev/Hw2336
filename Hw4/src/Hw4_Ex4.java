public class Hw4_Ex4 {
    public static void main(String[] x){
        double a, b, c;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // prompts and stores user input
        System.out.print("Please enter a, b, and c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        QuadracticEquation equation = new QuadracticEquation(a, b, c);

        if (equation.getDiscriminant() == 0)
            System.out.printf("The root of this equation is x = %.3f", equation.getRoot1());
        else if (equation.getDiscriminant() < 0)
            System.out.print("The equation has no real roots");
        else
            System.out.printf("The roots of this equation are x = %.3f and x = %.3f", equation.getRoot1(), equation.getRoot2());

    }
}
