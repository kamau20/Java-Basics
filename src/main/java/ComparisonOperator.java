public class ComparisonOperator {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 10;

        System.out.println("a == c: " + (a == c)); // true
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= c: " + (a >= c)); // true
        System.out.println("b <= a: " + (b <= a)); // true

        //For objects, use .equals() instead of ==
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("Strings equal: " + s1.equals(s2)); // true
    }
}
