import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = SafeInput.getNonZeroLenString(scanner, "Enter your name");
        System.out.println("Hello, " + userName + "!");
    }
}
