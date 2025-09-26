package skillbuilders;

import java.util.Scanner;

public class Digits2 {

    public static void main(String[] args) 
    {
        // Declaration
        int number;
        int ones;
        int tens;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a two-digit number: ");
        number = input.nextInt();

        // Process (find ones and tens place)
        ones = number % 10;
        tens = number / 10;

        // Output
        System.out.println("Tens place: " + tens);
        System.out.println("Ones place: " + ones);
    }
}
