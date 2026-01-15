import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double weight = in.nextDouble();

        System.out.println("Enter height in metres: ");
        double height = in.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n",bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        }   else {
            System.out.println("Category: Obesity");
        }

        in.close();
    }
}
