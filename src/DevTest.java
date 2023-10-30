import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(scanner, "Enter your name");
        System.out.println("Name: " + name);

        // Test getInt
        int age = SafeInput.getInt(scanner, "Enter your age");
        System.out.println("Age: " + age);

        // Test getDouble
        double salary = SafeInput.getDouble(scanner, "Enter your salary");
        System.out.println("Salary: " + salary);

        // Test getRangedInt
        int quantity = SafeInput.getRangedInt(scanner, "Enter the quantity", 1, 10);
        System.out.println("Quantity: " + quantity);

        // Test getRangedDouble
        double price = SafeInput.getRangedDouble(scanner, "Enter the price", 0.0, 100.0);
        System.out.println("Price: " + price);

        // Test getYNConfirm
        boolean confirmation = SafeInput.getYNConfirm(scanner, "Do you confirm? (Y/N)");
        System.out.println("Confirmation: " + confirmation);

        // Test getRegExString
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (e.g., 123-45-6789)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);
    }
}
