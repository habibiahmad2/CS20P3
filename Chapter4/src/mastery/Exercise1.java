package mastery;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner for input

        System.out.print("Enter the number of copies to be printed: ");
        int copies = input.nextInt(); // get number of copies

        double pricePerCopy; // store price

        // Determine price per copy
        if (copies <= 99) {
            pricePerCopy = 0.30;
        } else if (copies <= 499) {
            pricePerCopy = 0.28;
        } else if (copies <= 749) {
            pricePerCopy = 0.27;
        } else if (copies <= 1000) {
            pricePerCopy = 0.26;
        } else {
            pricePerCopy = 0.25;
        }

        double totalCost = copies * pricePerCopy; // calculate total

        // Display neatly with two decimals
        System.out.printf("Price per copy is: $%.2f%n", pricePerCopy);
        System.out.printf("Total cost is: $%.2f%n", totalCost);

        input.close(); // close Scanner
    }
}
