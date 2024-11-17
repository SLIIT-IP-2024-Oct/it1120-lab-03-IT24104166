import java.util.Scanner;

public class CurrencyDenominations {

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the amount
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        // Array of denominations in decreasing order
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        // Array to store the count of each denomination
        int[] counts = new int[denominations.length];
        
        // Calculate the number of notes/coins for each denomination
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = amount / denominations[i];  // Find how many notes of this denomination
            amount = amount % denominations[i];  // Remaining amount after using these notes
        }

        // Output the result
        System.out.println("Denominations required to form the amount:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes – " + counts[i]);
        }

        // Close the scanner
        scanner.close();
    }
}