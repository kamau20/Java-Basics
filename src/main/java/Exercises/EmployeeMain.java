package Exercises;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Elisha Kamau";
        employee1.salary = 50000;
        employee1.calculateBonus(0.05);
        employee1.printInfo();

    }
}
