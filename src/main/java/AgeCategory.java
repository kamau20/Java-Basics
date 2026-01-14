import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        String category;

        if (age <= 2) {
            category = "Infant";
        } else if (age <= 12) {
            category = "Child";
        } else if (age <= 19) {
            category = "Teenager";
        } else if (age <= 64) {
            category = "Adult";
        }   else {
            category = "Senior";
        }

        System.out.println("Category: " + category);
        scanner.close();
    }
}
