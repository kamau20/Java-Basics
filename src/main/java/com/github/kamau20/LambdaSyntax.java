package com.github.kamau20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSyntax {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Elisha", "Salome", "Mousa", "Rasoa", "Ceejay");

        // 1. Simple Lambda - print each name
        System.out.println("=== Printing names ===");
        names.forEach(name -> System.out.println());

        // 2. Lambda with Multiple Parameters - Sorting
        System.out.println("\n=== Sorting by length ===");
        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        names.forEach(System.out::println);

        // 3. Lambda with multiple statements
        System.out.println("\n=== Processing names ===");
        names.forEach(name -> {
            String processed = name.toUpperCase();
            int length = name.length();
            System.out.println(processed + " (" + length + " chars)");
        });

        // 4. Lambda with return statement
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = new ArrayList<>();
        numbers.forEach(n -> {
            int square = n * n;
            squares.add(square);
        });
        System.out.println("\nSquares: " + squares);
    }
}
