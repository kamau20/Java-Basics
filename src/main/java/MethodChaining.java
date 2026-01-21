public class MethodChaining {
    public static void main(String[] args) {
        int result1 = add(5, 3);
        int result2 = multiply(result1, 2);
        printResult(result2);
        printResult(multiply(add(5, 3), 2));
        String formatted = formatResult(calculateFinalScore(85, 90, 78));
        System.out.println(formatted);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void printResult(int value) {
        System.out.println("Result: " + value);
    }
    public static double calculateFinalScore(double test1, double test2, double test3) {
        return (test1 + test2 + test3) / 3;
    }
    public static String formatResult(double score) {
        return String.format("Final Score: %.2f", score);
    }
}
