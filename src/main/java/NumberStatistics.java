import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;
        System.out.println("Enter numbers (0 to stop): ");
        while (true) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            if (number == 0) {
                break; // Exit loop
            }
            if (number < 0) {
                System.out.println("Negative numbers ignored");
                continue; // Skip negative numbers
            }
            sum += number;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Count: " + count);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No valid numbers entered!");
        }
        scanner.close();
    }
}
