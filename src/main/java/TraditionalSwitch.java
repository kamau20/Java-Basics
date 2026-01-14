public class TraditionalSwitch {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
            case 4:
                dayName = "Thursday";
            case 5:
                dayName = "Friday";
            default:
                dayName = "Weekend";
        }
        System.out.println("Day " + day + " is " + dayName);
    }
}
