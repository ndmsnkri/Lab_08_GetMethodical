import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int favoriteInt = SafeInput.getInt(scanner, "Enter your favorite integer");
        double favoriteDouble = SafeInput.getDouble(scanner, "Enter your favorite double");
        System.out.println("\nFavorite Integer: " + favoriteInt);
        System.out.println("Favorite Double: " + favoriteDouble);
    }
}
