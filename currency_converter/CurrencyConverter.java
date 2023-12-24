import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Step 1: Allow the user to choose the base and target currency
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base currency code (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Enter target currency code (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Step 2: Fetch real-time exchange rates (Placeholder API)
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        // Step 3: Take input from the user for the amount to convert
        System.out.println("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
        double amountToConvert = scanner.nextDouble();

        // Step 4: Convert the input amount using the fetched exchange rate
        double convertedAmount = amountToConvert * exchangeRate;

        // Step 5: Display the result to the user
        System.out.println(amountToConvert + " " + baseCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
    }

    // Placeholder method for fetching exchange rates
    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        // In a real-world scenario, make an API call to get the exchange rate
        // For demonstration purposes, a placeholder value is used here
        // Replace this with actual API integration
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85; // Placeholder exchange rate
        } else {
            return 1.0; // Default to 1 if no specific rate is available
        }
    }
}
