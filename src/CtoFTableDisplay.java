public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius  |  Fahrenheit");
        System.out.println("----------------------");

        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius); // Calling the method for conversion
            System.out.printf("%6d  |  %9.2f%n", celsius, fahrenheit);
        }
    }

    // Method for Celsius to Fahrenheit conversion
    public static double CtoF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
