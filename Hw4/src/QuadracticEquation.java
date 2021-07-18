public class QuadracticEquation {
    // data fields
    private double a, b, c;

    // constructor
    QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // accessor methods
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    // utility methods
    public double getDiscriminant() { return (b * b) - (4 * a * c); }
    public double getRoot1() {
        double d = getDiscriminant();
        if (d >= 0)
            return ((- 1 * b) - Math.pow(d, .5)) / (2 * a);
        return 0;
    }
    public double getRoot2() {
        double d = getDiscriminant();
        if (d >= 0)
            return ((- 1 * b) + Math.pow(d, .5)) / (2 * a);
        return 0;
    }
}
