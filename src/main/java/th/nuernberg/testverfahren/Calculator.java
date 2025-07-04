package th.nuernberg.testverfahren;

public class Calculator {
    public int add(final int a, final int b) {
        return a + b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero!");
        }
        return (double) a / b;
    }
}
