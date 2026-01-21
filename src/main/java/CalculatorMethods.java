public class CalculatorMethods {
    public static void main(String[] args) {
        // Test the methods
        System.out.println("Addition: 5 + 3 = " + add(5, 3));
        System.out.println("Subtraction: 5 - 3 = " + subtract(5, 3));
        System.out.println("Multiplication: 5 * 3 = " + multiply(5, 3));
        System.out.println("Division: 5 / 3 = " + divide(5, 3));
        System.out.println("Division by zero: " + divide(5, 0));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a -b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.print("Error: ");
            return 0;
        }
        return (double) a / b;
    }
}
