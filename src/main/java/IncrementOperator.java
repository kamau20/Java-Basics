public class IncrementOperator {
    public static void main(String[] args) {
        int count = 5;

        // Post-increment: use then increment
        System.out.println("Count: " + count++); // Prints 5, then count becomes 6

        // Pre-increment: increment then use
        System.out.println("Count: + ++count"); // Count becomes 7, then prints 7

        //Decrement works similarly
        System.out.println("Count: " + count--); // Prints 7, then becomes 6
        System.out.println("Count: " + --count); // Becomes 5, then prints 5
    }
}
