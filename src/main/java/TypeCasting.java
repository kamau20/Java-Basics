public class TypeCasting {
    public static void main(String[] args) {

        // Implicit casting (widening) - automatic
        int myInt = 10;
        double myDouble = myInt; // int to double

        // Explicit casting (narrowing) - manual
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // double to int (truncates)

        System.out.println("Original double: " + anotherDouble); // 9.78
        System.out.println("Casted to int: " + anotherInt); // 9

        // String to number
        String numberStr = "123";
        int parsedInt = Integer.parseInt(numberStr);
        double parseDouble = Double.parseDouble("45.67");
    }
}
