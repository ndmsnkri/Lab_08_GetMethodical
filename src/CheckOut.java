import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the item price (0.50 - 10.00)", 0.50, 10.00);
            totalCost += itemPrice;
            moreItems = SafeInput.getYNConfirm(scanner, "Do you have more items to add?");
        } while (moreItems);

        System.out.printf("Total Cost: $%.2f%n", totalCost);
    }
}
