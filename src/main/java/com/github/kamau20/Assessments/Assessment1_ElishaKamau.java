package com.github.kamau20.Assessments;

public class Assessment1_ElishaKamau {
    public static void main(String[] args) {

        variableOperations(); // Quiz 1
        // gradeCalculator(); // Quiz 2
        // numberSequence(); // Quiz 3
        // inputValidation(); // Quiz 4
        // patternPrinting(); // Quiz 5
    }

    public static void variableOperations() {
        // Solution for Quiz Variable Operations

        int a = 15;
        int b = 4;
        int c = 7;

        int sum = a + b + c; // Calculates the sum
        int product = a * b; // Calculates the product
        int expressionResult = (a + b) * c; // Calculates the expressionResult
        int remainder = a % b; // Calculates the remainder

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Expression Result: " + expressionResult);
        System.out.println("Remainder: " + remainder);
    }
}
