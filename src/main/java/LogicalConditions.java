public class LogicalConditions {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;
        boolean isMember = false;

        // Using AND (&&) - both must be true
        if (age >= 18 && hasID) {
            System.out.println("Access granted with ID");
        }

        //Using OR - at least one true
        if (age >= 18 || isMember) {
            System.out.println("Special Access Granted");
        }

        // Complex Condition
        if ((age >= 21 && hasID) || isMember) {
            System.out.println("VIP Access Granted");
        }
    }
}
