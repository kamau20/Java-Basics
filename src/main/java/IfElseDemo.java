public class IfElseDemo {
    public static void main(String[] args) {
        int number = 7;

        // Even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // Positive or negative
        int value = -5;
        if (value >= 0) {
            System.out.println(value + " is positive or zero");
        } else {
            System.out.println(value + " is negative");
        }
    }
}
