import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int num = scanner.nextInt();

        System.out.println("Enter double: ");
        double decimal = scanner.nextDouble();

        System.out.println("Enter boolean (true/false): ");
        boolean flag = scanner.nextBoolean();

        scanner.nextLine(); // Clear buffer

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("You entered: " + num + ", " + decimal + ", " + flag + ", " + text);

        scanner.close();

    }
}
