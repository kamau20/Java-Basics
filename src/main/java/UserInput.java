import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // Read String Input

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // Read Integer Input

        System.out.println("Hello " + name + ", you are " + age + " years old!");

        scanner.close(); //Always close scanner when done
    }
}
