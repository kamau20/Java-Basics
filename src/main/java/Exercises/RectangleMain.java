package Exercises;

public class RectangleMain {
    public static void main(String[] args) {
        // Test different constructors
        Rectangle rect1 = new Rectangle(); // 1*1
        Rectangle rect2 = new Rectangle(5, 3); // 5*3
        Rectangle rect3 = new Rectangle(4); // 4*4 (square)

        rect1.displayInfo();
        System.out.println("---");
        rect2.displayInfo();
        System.out.println("---");
        rect3.displayInfo();
    }
}
