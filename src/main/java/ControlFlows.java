// THE FOR LOOP

public class ControlFlows {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {
            System.out.println("Hello!");
        }

        for (int i = 1; i<=5; i++) {
            System.out.println("Number: " + i);
        }

        for (int i = 0; i<3; i++) {
            System.out.println("Iteration: " + i);
        }

        for (int i = 2; i<=10; i += 2) {
            System.out.println("Even: " + i);
        }

        for (int i = 1; i<=9; i += 2) {
            System.out.println("Odd: " + i);
        }

        int sum = 0;
        for (int i = 1; i<=100; i++) {
            sum += i;

            System.out.println("Sum 1-100: " + sum);
        }
    }
}
