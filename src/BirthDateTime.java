import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = SafeInput.getRangedInt(scanner, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(scanner, "Enter your birth month", 1, 12);
        int day;
        switch (month) {
            case 2:
                day = SafeInput.getRangedInt(scanner, "Enter the day of your birth", 1, 29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(scanner, "Enter the day of your birth", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(scanner, "Enter the day of your birth", 1, 31);
        }
        int hours = SafeInput.getRangedInt(scanner, "Enter the hour of your birth", 1, 24);
        int minutes = SafeInput.getRangedInt(scanner, "Enter the minutes of your birth", 1, 59);

        System.out.println("Date and Time of Birth: " + year + "-" + month + "-" + day + " " + hours + ":" + minutes);
    }
}
