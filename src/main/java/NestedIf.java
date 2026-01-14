public class NestedIf {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("You can enter the club!");
            }   else {
                System.out.println("You need ID to enter.");
            }
        }   else {
            System.out.println("You are too young to enter.");
        }
    }
}
