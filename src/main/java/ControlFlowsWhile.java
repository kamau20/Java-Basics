// THE WHILE LOOP
// Password Validation

import java.util.Scanner;

public class ControlFlowsWhile {
    public static void main(String[] args) {
        String password = "secret123";
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        while (!userInput.equals(password)) {
            System.out.println("Enter password: ");
            userInput = scanner.nextLine();
            if (!userInput.equals(password)) {
                System.out.println("Incorrect! Try again");
            }
        }
        System.out.println("Access Granted!");
    }
}


