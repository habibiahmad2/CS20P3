package skillbuilders;

import java.util.Scanner;  // lets us read numbers from the keyboard

public class PerfectSquare
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // make a Scanner

        // Ask the user for a number
        System.out.print("Enter a whole number: ");
        int number = keyboard.nextInt();

        // Find the square root of the number
        double root = Math.sqrt(number);

        // Check if the root is a whole number
        if (root == (int) root)
        {
            System.out.println(number + " is a perfect square.");
        }
        else
        {
            System.out.println(number + " is NOT a perfect square.");
        }

        keyboard.close(); // close the Scanner
    }
}
