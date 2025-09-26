package mastery;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cents;
        int quarters, dimes, nickels, pennies;

        // ask user for amount
        System.out.print("Enter the change in cents: ");
        cents = input.nextInt();

        // calculate coins
        quarters = cents / 25;
        cents = cents % 25;

        dimes = cents / 10;
        cents = cents % 10;

        nickels = cents / 5;
        cents = cents % 5;

        pennies = cents;

        // show result to user 
        System.out.println("The minimum number of coins is: ");
        System.out.println("Quarters = " + quarters);
        System.out.println("Dimes = " + dimes);
        System.out.println("Nickels = " + nickels);
        System.out.println("Pennies = " + pennies);
    }
}
